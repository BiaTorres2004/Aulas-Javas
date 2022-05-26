import java.util.ArrayList;
import java.util.List;//importação do list

public class Main {

	public static void main(String[] args) {
	
//		//primeiro uso de recursos do java
//		//adc,exclui e atualiza coisas
//		
//		List lista = new ArrayList();//cria lista e array
//		
//		lista.add("abc");//adc a lista
//		lista.add(12);
//		lista.add(true);
//		
////		for(int x=0; x<lista.size(); x++) {//lista size é tamanho da lista
////		System.out.println(lista.get(x));//pega o valor que o indicie representa
////	}
//		for(Object valor : lista) {//funciona igual a de cima valor guarda o valor e guarda na lista
//			System.out.println(valor);//mostra 
//	    }//a diferença dos dois é que o primeiro limita a busca o segundo não
//		
//		System.out.println();
//		lista.remove(0);//remove da lista e 12 passa a ser 0
//		for(Object valor : lista) {//funciona igual a de cima valor guarda o valor e guarda na lista
//			System.out.println(valor);//mostra 
//		}
//		System.out.println();	
//		lista.add(0, "def");//para mudar, aonde quero colocar, io que eu quero coloocar
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println();	
//		lista.set(0, "ghi");//para mudar, aonde quero colocar, io que eu quero coloocar
//		for(Object valor : lista) {
//			System.out.println(valor);
//		}
//		//clear limpa a lista
//		System.out.println();
//			
//		lista.clear();
//		if(lista.isEmpty())//verifica se esta vazia
//			System.out.println("sua lista esta vazia");
//		}

	//conta
		Conta conta1 = new Conta("Agua", 60.000);
		Conta conta2 = new Conta("Luz", 120.000);
	
		List<Conta> listaDeContas = new ArrayList<Conta>();//criando a lista generica so aceita obj do tipo conta
		
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for (Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		
	
		}
}
