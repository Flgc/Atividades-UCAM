package Thread;

public class Aplicativo {

	public static void main(String[] args) {
		LerArquivo tmp = new LerArquivo();
		
		//Implemented time with personal definition
		Thread t1 = new Thread(tmp,"150");
		Thread t2 = new Thread(tmp,"200");
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
	}

}
