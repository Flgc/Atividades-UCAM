package com.ead.arquivos;

import java.io.File;

public class ListaDeArquivos {

	public static void main(String[] args) {
		
		//Explorando a classe File
		
		String pasta = "D:/vendor";
		File file = new File(pasta);
		
		if (file.isDirectory()) {
			System.out.println("\"" + pasta + "\" é um diretório: ");
		}
		
		String[] arquivos = file.list();
		for (String arquivo: arquivos) {
			File f = new File(pasta + "/" + arquivo);
			if (f.isDirectory()) {
				System.out.println("pasta      => " + arquivo);
			}
			else {
				System.out.println("arquivo   => " + arquivo);
			}
		}
		
	}

}
