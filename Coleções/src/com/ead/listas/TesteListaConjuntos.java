package com.ead.listas;

import java.util.ArrayList;

public class TesteListaConjuntos {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa(212, "Eusebio"));
		pessoas.add(new Pessoa(154, "Matheus"));
		pessoas.add(new Pessoa(421, "Ana"));
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}

}
