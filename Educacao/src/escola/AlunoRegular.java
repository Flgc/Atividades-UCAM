package escola;

public class AlunoRegular extends Aluno {
	
	private Integer registro;

	public AlunoRegular(String nome, int idade, int registro, String orientador) {
		super(nome, idade);
		this.registro = registro;
		this.orientador = orientador;
	}
	
	
	@Override
	public String listarDados() {
		return super.listarDados() + "O R I E N T A D O R: " + orientador + "\n";
	}
}
