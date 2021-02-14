package com.ead.beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="usuarios")
@SessionScoped
public class UsuariosBean {
	
	private String nome, senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String validarUsuario() {
		if (nome.equals("user") && senha.equals("123")) {
			return "/sucesso";
		} 
		else {
			return "/erro";
		}
	}
	
	

}
