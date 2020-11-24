package com.ead.programs;

public class TesteExcecoes02 {

	public static void main(String[] args) {
		
		try {
			String resultado = Pessoa.exibirMaioridade(-10);
			System.out.println(resultado);
		} catch (IllegalArgumentException e) {
		System.out.println(e.getMessage());
		}
	}

}
