package com.ead.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoContatos {

	private Connection cn;
	private PreparedStatement stmt;
	private ResultSet rs;

	private String url = "jdbc:mysql://localhost:3306/agenda";

	private void abrirConexao() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, "root", "");
		} catch (Exception e) {
			throw e;
		}
	}
	
	private void fechaConexao() throws Exception {
		cn.close();
	}
}
