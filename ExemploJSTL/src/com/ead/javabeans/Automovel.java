package com.ead.javabeans;

import java.util.ArrayList;
import java.util.List;

public class Automovel {

	private String marca, modelo;
	private int ano;

	public Automovel(String marca, String modelo, int ano) {
		setMarca(marca);
		setModelo(modelo);
		setAno(ano);
	}

	public Automovel() {
	}

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

	public List<Automovel> getListaVeiculos() {
		List<Automovel> lista = new ArrayList<Automovel>();
		lista.add(new Automovel("Ford", "Fiesta", 2012));
		lista.add(new Automovel("Peugeot", "208", 2014));
		lista.add(new Automovel("GM", "Corsa", 2009));
		
		return lista;
	}

}
