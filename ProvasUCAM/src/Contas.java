import org.eclipse.jdt.annotation.NonNull;

public class Contas implements Comparable<Contas>{

	private int numeroBanco;
	private int numeroAgencia;
	private int numeroConta;

	public Contas(int numeroBanco, int numeroAgencia, int numeroConta) {
		this.numeroBanco = numeroBanco;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
	}

	public int getNumeroBanco() {
		return numeroBanco;
	}

	public void setNumeroBanco(int numeroBanco) {
		this.numeroBanco = numeroBanco;
	}

	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	@Override
	public String toString() {
		return "Contas [ Banco = " + numeroBanco + ",  Agencia = " + numeroAgencia + ",  Num. Conta = "
				+ numeroConta + " ]";
	}


	@Override
  public int compareTo(@NonNull Contas comparator) {
		if (comparator.getNumeroBanco() != getNumeroBanco()) {
			return Integer.compare(comparator.getNumeroBanco(), getNumeroBanco());
		} 
		else if (comparator.getNumeroAgencia() != getNumeroAgencia()) {
			return Integer.compare(comparator.getNumeroAgencia(), getNumeroAgencia());
		}
		
		return Integer.compare(comparator.getNumeroConta(), getNumeroConta());
  }
	
}
