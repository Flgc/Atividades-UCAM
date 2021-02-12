package com.ead.javabeans;

public class Automovel {

	private String marca, modelo;
	private int ano;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getMensagem() {
		if (ano > 2009) {
			return "Carro Novo";
		}
		return "Carro velho";		
	}
	
}
