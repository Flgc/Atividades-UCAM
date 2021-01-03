package com.ead.arquivos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JOptionPane;

import com.ead.arquivos.classes.Imovel;

public class LerImovel {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:/imovel.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Imovel imovel = (Imovel)ois.readObject();
			JOptionPane.showMessageDialog(null, imovel.getArea() + ", " +
			imovel.getEndereco());
			ois.close();
			fis.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
