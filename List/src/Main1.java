import java.util.ArrayList;
import java.util.List;

public class Main1 {
	
	
	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
		lista.add("abc");
		lista.add(12);
		lista.add(true);
//	    for(int x=0; x< lista.size(); x++) {
//	    	System.out.println(lista.get(x));
	    	
//	    }
		for(Object valor : lista) {
			System.out.println(valor);
			
		}
		
		System.out.println();
		lista.remove(0);
		for(Object valor : lista) {
			System.out.println(valor);
			}
		System.out.println();
		
		lista.add(0, "def");
		for(Object valor : lista) {
			System.out.println(valor);
			
		}
		System.out.println();
		
		lista.set(0, "ghi");
		for(Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();
		lista.clear();
		if(lista.isEmpty()) {
			System.out.println("Sua lista está vazia");
			
		}
		Conta conta1 = new Conta("Água", 60,00);
		Conta conta2 = new Conta("Luz", 120,00);
		
		List<Conta> 
	}

}
