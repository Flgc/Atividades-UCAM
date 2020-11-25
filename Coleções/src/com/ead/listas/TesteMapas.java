package com.ead.listas;

import java.util.HashMap;
import java.util.Map;

public class TesteMapas {

	public static void main(String[] args) {
		HashMap<Integer, String> alunos = new HashMap<Integer, String>();
		alunos.put(12547, "José Carlos");
		alunos.put(36279, "Antonio");
		alunos.put(92478, "Daniela Mendes");
		alunos.put(38547, "Denis Nunes");
		
		for(Map.Entry<Integer, String> aluno: alunos.entrySet()) {
			System.out.println(aluno.getKey() + " - " + aluno.getValue());
		}
		
		if (alunos.containsKey(12547)) {
			String aluno = alunos.get(12547);
		}
		
	}

}
