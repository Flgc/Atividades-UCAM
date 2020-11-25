package com.ead.listas;

import java.util.HashSet;

public class TesteListaPessoas {

	public static void main(String[] args) {
		HashSet<String> nomes = new HashSet<String>();
		System.out.println(nomes.add("Eusebio"));
		System.out.println(nomes.add("Matheus"));
		System.out.println(nomes.add("Ana"));
		System.out.println(nomes.add("Benedito"));
		System.out.println(nomes.add("Emanoel"));
		System.out.println(nomes.add("Eusebio"));
	}

}
