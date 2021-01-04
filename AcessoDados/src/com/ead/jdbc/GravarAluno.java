package com.ead.jdbc;

import java.sql.*;

import javax.swing.JOptionPane;

public class GravarAluno {
	public static void main(String[] args)  {
		Connection cn = null;
		PreparedStatement st;
		
		String conexao = "jdbc:mysql://localhost:3306/escola";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(conexao,"root" ,"");

			//Obtendo dados de entrada do usuário
			int rm = Integer.parseInt(JOptionPane.showInputDialog("Qual o RM? "));
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
			String curso = JOptionPane.showInputDialog("Qual o curso? ");
			
			st = cn.prepareStatement("INSERT INTO ALUNOS (RM,NOME,CURSO) VALUES (?,?,?)");
			st.setInt(1, rm);
			st.setString(2,nome);
			st.setString(3,curso);
			
			st.executeUpdate();
			JOptionPane.showMessageDialog(null,"Aluno incluido com sucesso!");
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
