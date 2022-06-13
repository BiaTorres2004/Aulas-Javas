
public class Main {

	public static void main(String[] args) {
/*Aqui Beatriz está iniciando com 1 figurinhas*/ 
		Pessoa pessoa1 = new Pessoa(); 
	        pessoa1.nome = "Beatriz";
		pessoa1.numFigurinhas = 1;

 /*Aqui sera usado o metodo receber e dar*/ 
                pessoa1.receber(3); 
                pessoa1.dar(3); 

/*Aqui Vai mostrar no console a quantidade de figurinhas*/ 		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);
	
			
	}

}
