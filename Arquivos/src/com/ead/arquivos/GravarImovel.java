package com.ead.arquivos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import com.ead.arquivos.classes.Imovel;

public class GravarImovel {

	public static void main(String[] args) {
		
		try {
			Imovel imovel = new Imovel(125, "Av. Paulista, 3545");
			
			//Armazenar o objeto imóvel em um arquivo
			FileOutputStream fos = new FileOutputStream("D:/imovel.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(imovel);
			oos.close();
			JOptionPane.showMessageDialog(null, "Arquivo criado!");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
