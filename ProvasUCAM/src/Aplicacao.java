import java.util.ArrayList;
import java.util.Collections;

public class Aplicacao {

	public static void main(String[] args) {
		
		ArrayList<Contas> contas = new ArrayList<Contas>();
	
		contas.add(new Contas(14, 6, 20));
		contas.add(new Contas(18, 3, 21));
		contas.add(new Contas(14, 6, 22));
		contas.add(new Contas(15, 7, 11));		
		
		Collections.sort(contas);
		
		for (int i = 0; i < contas.size(); i++){
			Contas conta = contas.get(i);
			System.out.println(conta);
		}
		
	}

}
