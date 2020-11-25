package com.ead.listas;

import java.util.ArrayList;

public class TesteListas {
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		lista.add("Manoel");
		lista.add("James");
		lista.add("Claudia");
		lista.add(1200);

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) instanceof String) {
				String nome = (String) lista.get(i);
				System.out.println(lista.get(i));
			}
		}
	}
}
