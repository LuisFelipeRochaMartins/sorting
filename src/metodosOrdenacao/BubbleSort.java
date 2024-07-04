package metodosOrdenacao;

public class BubbleSort{

	private static long comparacoes;
	private static long trocas;

	public static void bubbleSort(int[] valores) {

		int tamArray = valores.length;
		boolean trocou;

		comparacoes = 0;
		trocas = 0;

		for (int i = 0; i < tamArray - 1; i++) {
			trocou = false;
			for (int j = 0; j < tamArray - 1 - i; j++) {
				comparacoes++; // **COMPARAÇÃO**
				if (valores[j] > valores[j + 1]) {
					int temp = valores[j];
					valores[j] = valores[j + 1];
					valores[j + 1] = temp;
					trocou = true;
					trocas++; // **TROCA**
				}
			}

			if (!trocou) {
				break;
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
