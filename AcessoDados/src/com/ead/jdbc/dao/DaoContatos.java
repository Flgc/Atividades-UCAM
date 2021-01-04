package com.ead.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ead.jdbc.entidade.Contatos;

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

	private void fecharConexao() throws Exception {
		cn.close();
	}

	public void incluir(Contatos contato) throws Exception {
		try {
			abrirConexao();
			stmt = cn.prepareStatement("INSERT INTO CONTATOS (NOME_CONTATO, TELEFONE_CONTATO, "
					+ "EMAIL_CONTATO, DATA_CADASTRO) VALUES (?,?,?,?)");
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());
			stmt.setString(3, contato.getEmail());
			stmt.setDate(4, new java.sql.Date(contato.getData().getTime()));

			stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
	}

	public void remover(int id) throws Exception {
		try {
			abrirConexao();
			stmt = cn.prepareStatement("DELETE FROM CONTATOS WHERE ID=?");
			stmt.setInt(1, id);

			stmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
	}

	public Contatos buscar(int id) throws Exception {
		Contatos contato = null;
		try {
			abrirConexao();
			stmt = cn.prepareStatement("SELECT * FROM CONTATOS WHERE ID=?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();

			if (rs.next()) {
				contato = new Contatos();
				contato.setId(id);
				contato.setNome(rs.getString("NOME_CONTATO"));
				contato.setTelefone(rs.getString("TELEFONE_CONTATO"));
				contato.setEmail(rs.getString("EMAIL_CONTATO"));
				contato.setData(rs.getDate("DATA_CADASTRO"));
			}
		} catch (Exception e){
			throw e;
		}finally {
			fecharConexao();
		}
		return contato;
	}
	
	public void alterar(Contatos contato) throws Exception{
		try {
			abrirConexao();
			stmt = cn.prepareStatement("UPDATE CONTATOS SET NOME_CONTATO=?,  TELEFONE_CONTATO=?," +
															"EMAIL_CONTATO=?,DATA_CADASTRO=? WHERE ID=?");
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getTelefone());
			stmt.setString(3,contato.getEmail());
			stmt.setDate(4, new java.sql.Date(contato.getData().getTime()));
			stmt.setInt(5, contato.getId());
			
			stmt.executeUpdate();
		} catch (Exception e){
			throw e;
		}finally {
			fecharConexao();
		}
	}

	public List<Contatos> listar() throws Exception{
		List<Contatos> contatos = new ArrayList<Contatos>();
		try {
			abrirConexao();
			stmt = cn.prepareStatement("SELECT * FROM CONTATOS");
			
			while(rs.next()) {
				Contatos contato = new Contatos();
				contato.setId(rs.getInt("ID"));
				contato.setNome(rs.getString("NOME_CONTATO"));
				contato.setTelefone(rs.getString("TELEFONE_CONTATO"));
				contato.setEmail(rs.getString("EMAIL_CONTATO"));
				contato.setData(rs.getDate("DATA_CADASTRO"));
				
				contatos.add(contato);
			}
		} catch (Exception e){
			throw e;
		}finally {
			fecharConexao();
		}
		return contatos;
	}
}
