package POO_Desafio;

public abstract interface NavegadorNaInternet  {
	static void exiberPagina() {
		System.out.println("pagina carregada processando para ser exibida");
		}
	
	static void adicionarNovaAba() {
		System.out.println("adicionada nova aba");
	}
	
	static void atualizarPagina() {
		System.out.println("Atencao pagina sera recarregada em instantes !");
	}


}
