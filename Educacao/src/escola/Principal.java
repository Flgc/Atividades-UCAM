package escola;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno = new AlunoRegular("Carlo", 20, 1, "Prof. Marcos");
		JOptionPane.showInternalMessageDialog(null, aluno.listarDados());
		JOptionPane.showInputDialog(aluno.listarDados());
		JOptionPane.showMessageDialog(null, aluno.listarDados());
		
		String valor = JOptionPane.showInputDialog(null, "Informe um número: ");
		StringBuilder strBuilder = new StringBuilder();
		
		for (int i = 1; i <= 10; i++) {
			strBuilder.append(valor + " X " + i + " = " + Integer.parseInt(valor) * i +  "\n");
		}
		
		JOptionPane.showMessageDialog(null, strBuilder);
	}

}
