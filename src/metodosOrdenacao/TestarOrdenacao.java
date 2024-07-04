package metodosOrdenacao;

public class TestarOrdenacao {

	//   **REALIZA OS TESTES COM OS ARRAYS**
	public void Ordenar(String nome, Main.Algoritmo metodo, int[] ordenado, int[] invertido, int[] randomico) {
		System.out.println("=====================");
		System.out.println(nome);
		Array array = new Array();
		array.TempodeExecucao("Ordenado", metodo, ordenado);
		array.TempodeExecucao("Invertido", metodo, invertido);
		array.TempodeExecucao("Randômico", metodo, randomico);
		System.out.println();
	}

}
