package com.ead.classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arquivosb {
	public static void lerArquivos(String nomeArquivo) throws FileNotFoundException, IOException{
			FileReader reader = new FileReader(nomeArquivo);
			//procedimento para leitura do arquivo
			reader.close();	
	}

}
