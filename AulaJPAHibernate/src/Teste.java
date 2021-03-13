import java.util.List;

public class Teste {

	public static void main(String[] args) {

/*		
		Aluno a1 = new  Aluno();
		a1.setNome("João Silva");
		a1.setIdade(12);
		a1.setMatricula("123456789");

		Aluno a2 = new  Aluno();
		a2.setNome("Mario João Silva");
		a2.setIdade(21);
		a2.setMatricula("9123456789");
		
		Aluno a3 = new  Aluno();
		a3.setNome("Dino João Silva");
		a3.setIdade(22);
		a3.setMatricula("98123456789");
		
		Aluno a4 = new  Aluno();
		a4.setNome("Bian João Silva");
		a4.setIdade(31);
		a4.setMatricula("65123456789");
		
		Aluno a5 = new  Aluno();
		a5.setNome("Caopão Silva");
		a5.setIdade(41);
		a5.setMatricula("456123456789");
*/		
		AlunoController con = new AlunoController();
		
/*		con.salvar(a1);
		con.salvar(a2);
		con.salvar(a3);
		con.salvar(a4);
		con.salvar(a5);
*/		
		// con.remover(all);
		
		List<Aluno> alunos = con.listar();
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println("Nome: "+alunos.get(i).getNome()+" - Idade: "+alunos.get(i).getIdade()+" - Matrícula: "+alunos.get(i).getMatricula() 	);
		}

	}

}
