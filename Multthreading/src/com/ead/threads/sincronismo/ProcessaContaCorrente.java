package com.ead.threads.sincronismo;

public class ProcessaContaCorrente implements Runnable {

	ContaCorrente conta = new ContaCorrente();

	private void efetuarOperacao(double valor) {
		String nome = Thread.currentThread().getName();
		try {
			if (conta.VerificaSaldo(valor)) {
				System.out.println("Valor sacado por " + nome + " : " + valor);
				System.out.println("Saldo para " + nome + " : " + conta.efetuarSaque(valor));
			} else {
				System.out.println("Saldo Insuficiente para " + nome);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(180);
				efetuarOperacao(20);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
