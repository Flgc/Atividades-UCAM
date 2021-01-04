package com.ead.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class LerAluno {
	public static void main(String[] args) {
		Connection cn = null;
		PreparedStatement st;
		ResultSet rs;

		String conexao = "jdbc:mysql://localhost:3306/escola";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(conexao, "root", "");

			st = cn.prepareStatement("SELECT * FROM ALUNOS");
			rs = st.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("RM"));
				System.out.println(rs.getString("NOME"));
				System.out.println(rs.getString("CURSO"));
				System.out.println("----------------------------");
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
