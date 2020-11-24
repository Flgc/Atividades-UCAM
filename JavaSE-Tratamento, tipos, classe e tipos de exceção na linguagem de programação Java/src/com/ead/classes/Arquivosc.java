package com.ead.classes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arquivosc {
	public static void lerArquivos(String nomeArquivo) throws Exception{
			FileReader reader = new FileReader(nomeArquivo);
			//Super Classe - procedimento para leitura do arquivo
			reader.close();	
	}

}
