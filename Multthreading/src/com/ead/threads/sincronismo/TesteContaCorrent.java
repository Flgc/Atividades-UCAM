package com.ead.threads.sincronismo;

public class TesteContaCorrent {

	public static void main(String[] args) {
		
		ProcessaContaCorrente cc = new ProcessaContaCorrente();
		Thread t = new Thread(cc, "Joâo");
		Thread t2 = new Thread(cc, "Maria");
		
		try {
			t.start();
			t2.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
