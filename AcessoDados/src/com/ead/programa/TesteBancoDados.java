package com.ead.programa;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import com.ead.jdbc.dao.DaoContatos;
import com.ead.jdbc.entidade.Contatos;

public class TesteBancoDados {

	public static void main(String[] args) {
		
		//Inserindo registro
		Contatos contato = new Contatos();
		contato.setNome("Jeremias Santos");
		contato.setTelefone("2254-9800");
		contato.setEmail("heremias@gmail.com");
		contato.setData(new Date());
		
		DaoContatos dao = new DaoContatos();
		try {
			dao.incluir(contato);
			JOptionPane.showMessageDialog(null, "Contato inserido com sucesso!");
			
			//Listando os contatos
			List<Contatos> contatos = dao.listar();
			for(Contatos c: contatos) {
				System.out.println("ID: " + c.getId());
				System.out.println("NOME: " + c.getNome());
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
