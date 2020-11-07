package escola;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno = new AlunoRegular("Carlo", 20, 1, "Prof. Marcos");
		JOptionPane.showInternalMessageDialog(null, aluno.listarDados());
	}

}
