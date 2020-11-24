package com.ead.classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arquivos {
	public static void lerArquivos(String nomeArquivo) {
		try {
			FileReader reader = new FileReader(nomeArquivo);
			//procedimento para leitura do arquivo
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
