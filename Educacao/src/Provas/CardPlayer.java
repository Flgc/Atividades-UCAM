package Provas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CardPlayer extends Player implements Serializable {
	private static final long serialVersionUID = 1L;

	CardPlayer() {
		System.out.print("c");
	}

	public static void main(String[] args) {
		CardPlayer c1 = new CardPlayer();
		try {
			FileOutputStream fos = new FileOutputStream("play.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(c1);
			os.close();
			FileInputStream fis = new FileInputStream("play.txt");
			ObjectInputStream is = new ObjectInputStream(fis);
			CardPlayer c2 = (CardPlayer) is.readObject();
			is.close();
		} catch (Exception x) {
		}
	}
}
