package Thread;

import java.io.FileReader;

public class LerArquivo implements Runnable {

	@Override
	public synchronized void run() {
		try {
			FileReader arquivo = new FileReader("D:/dados.txt ");
			
			String theTime = Thread.currentThread().getName();
			
			int thisTime = Integer.parseInt(theTime);
			
			while (true) {
				int c = arquivo.read();
				if (c == -1) {
					break;
				}
				System.out.print((char) c);
				Thread.sleep(thisTime);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
