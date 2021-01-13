package com.ead.listas;

import java.util.ArrayList;
import java.util.Collections;

public class Banco {

	public static void main(String[] args) {
		
		ArrayList<Contas> contas = new ArrayList<Contas>();
		
		int[]banco = {077, 341, 104, 033};
		int[]bancoagencia = {2786, 3478, 1478, 1877};
		int[]conta = {11717, 17814, 31470, 20470};
		
		contas.add(0, 077);
		
		Collections.sort(banco);

	}
}
