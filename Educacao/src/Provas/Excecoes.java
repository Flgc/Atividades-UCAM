package Provas;

public class Excecoes {
	
	
	private static void exibir() {
		System.out.println("teste ");
		throw new RuntimeException("erro");
	}

	public static void main(String[] args) {
		try {
			exibir();
			System.out.println(" ok");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
