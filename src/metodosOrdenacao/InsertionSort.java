package metodosOrdenacao;

public class InsertionSort {

	private static long comparacoes;
	private static long trocas;

	public static void insertionSort(int[] array) {
		comparacoes = 0;
		trocas = 0;

		for (int i = 1; i < array.length; i++) {
			int j = i;
			while (j > 0 && array[j] < array[j - 1]) {
				int aux = array[j];
				array[j] = array[j - 1];
				array[j - 1] = aux;
				j = j - 1;
				trocas++; // **TROCA**
				comparacoes++; // **COMPARAÇÃO**
			}

			if (j > 0) {
				comparacoes++;
			}
		}

		System.out.println(getSort());
	}

	public static String getSort() {
		StringBuilder builder = new StringBuilder();
		builder.append("--------------------\n");
		builder.append("Operações => " + comparacoes + "\n");
		builder.append("Trocas => " + trocas);
		return builder.toString();
	}
}