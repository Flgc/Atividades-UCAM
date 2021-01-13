package com.ead.listas;

public class Contas {

	private int numeroBanco;
	private int numeroAgencia;
	private int numeroConta;
	
	public Contas(int numeroBanco, int numeroAgencia, int numeroConta) {
		this.numeroBanco = numeroBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
	}

	public int getNumeroBanco() {
		return numeroBanco;
	}

	public void setNumeroBanco(int numeroBanco) {
		this.numeroBanco = numeroBanco;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroAgencia;
		result = prime * result + numeroBanco;
		result = prime * result + numeroConta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contas other = (Contas) obj;
		if (numeroAgencia != other.numeroAgencia)
			return false;
		if (numeroBanco != other.numeroBanco)
			return false;
		if (numeroConta != other.numeroConta)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contas [numeroBanco=" + numeroBanco + ", numeroAgencia=" + numeroAgencia + ", numeroConta="
				+ numeroConta + "]";
	}
	
}
