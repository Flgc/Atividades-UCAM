package com.ead.programs;

import javax.swing.JOptionPane;

public class TesteExcecoes03 {

	public static void main(String[] args) {
		try {
			String idade = JOptionPane.showInputDialog("Informe a sua idade: ");
			int valorIdade = Integer.parseInt(idade);
			String resultado = Pessoa.exibirMaioridade(valorIdade);
			System.out.println(resultado);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
