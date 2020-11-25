package com.ead.listas;

import java.util.TreeSet;

public class TesteConjunto02 {

	public static void main(String[] args) {
		TreeSet<String> nomes = new TreeSet<String>();
		System.out.println(nomes.add("Eusebio"));
		System.out.println(nomes.add("Matheus"));
		System.out.println(nomes.add("Ana"));
		System.out.println(nomes.add("Benedito"));
		System.out.println(nomes.add("Emanoel"));
		System.out.println(nomes.add("Eusebio"));
		System.out.println(nomes.add("-----------"));
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}

}
