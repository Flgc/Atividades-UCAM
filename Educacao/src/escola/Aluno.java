package escola;

public class Aluno {

	private String nome;
	private int idade;
	protected String orientador;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String listarDados() {
		return "N O M E: " + nome + "\nI D A D E: "+ idade + "\n";
	}
	
}
