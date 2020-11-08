package megasena;

import java.util.Random;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Integer[] numeros = new Integer[6];
		Random random = new Random();
		StringBuilder mesagem = new StringBuilder();

		for (int i = 0; i < 6; i++) {
			numeros[i] = random.nextInt(60) + 1;
			for (int j = 0; j < i; j++) {
				if (numeros[i] == numeros[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int j = 0; j < 6; j++) {
			mesagem.append(numeros[j] + " ");
			JOptionPane.showMessageDialog(null, mesagem);
		}

	}
}
