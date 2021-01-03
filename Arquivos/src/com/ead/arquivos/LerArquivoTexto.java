package com.ead.arquivos;

import java.io.FileReader;

public class LerArquivoTexto {
public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("d:/mensagem.txt");
		
		//Leitura do arquivo um caracter por vez
		while(true) {
			int c = fr.read();
			if (c == -1) {
				break;
			}
			System.out.print((char) c);
		}
	
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
