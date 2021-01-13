package Provas;

import java.util.ArrayList;

public class testar {

	
	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		String nome = "";
		lista.add("Apple");
		lista.add("Orange");
		lista.add("Banana");
		lista.add("Peach");
		lista.add("Potato");

		for (int i = 0; i < lista.size(); i++) {
			nome = (String) lista.get(i);
			if(nome.equals("Potato")) {
				System.out.println("Não é fruta!");
			}
		}
	
	}

}
