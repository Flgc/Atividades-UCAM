package com.ead.arquivos;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class GravarArquivo {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:/saida.txt", true);
			String nome = JOptionPane.showInputDialog("Informe um nome: ");
			fw.write(nome + "\r\n"); 
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
