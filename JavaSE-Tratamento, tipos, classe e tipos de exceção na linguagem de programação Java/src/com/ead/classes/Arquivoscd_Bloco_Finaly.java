package com.ead.classes;

import java.io.FileReader;

public class Arquivoscd_Bloco_Finaly {
	public static void lerArquivos(String nomeArquivo) throws Exception{
			FileReader reader = null;
			try {
				reader = new FileReader(nomeArquivo);
			} catch (Exception e) {
				// trata do erro
			} finally {
				reader.close();
			}
	}
}
