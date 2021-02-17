package com.ead.beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="alunos")
@SessionScoped
public class AlunosBean {
	
	private String nome, rm, curso, email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String validarAluno() {
		if (nome.equals("fabio") && rm.equals("001") && curso.equals("java") && email.equals("java@gmail.com")) {
			return "/sucesso";
		} 
		else {
			return "/erro";
		}
	}
}
