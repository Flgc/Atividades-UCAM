package com.ead.arquivos.classes;

import java.io.Serializable;

public class Imovel implements Serializable {
	private double area;
	private String endereco;

	public Imovel(double area, String endereco) {
		this.setArea(area);
		this.setEndereco(endereco);
	}
	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}