package com.ead.listas;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListasGeneric {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Manoel");
		lista.add("James");
		lista.add("Claudia");

		Collections.sort(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			String nome = lista.get(i);
			System.out.println(nome);
		}
		System.out.println("------------------");
		lista.remove(0); //Remove Manoel da lista
		lista.remove("Claudia"); //remove a String "Claudia" da lista
	}
}
