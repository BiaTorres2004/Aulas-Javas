/*O que são classes abstratas? São classes que não podem ser intanciada apenas herdada, ela funciona como uma espécie de classe especial não pode ter um objeto criado na sua instanciação*/

public class Aplicacao {

	public static void main(String[] args) 
		
	/*Aqui está sendo criada a variável */
	Item item = new Cogumelo();  
			item.pegar();
	
	/*Variável aqui está sendo criada*/
	item = new Moeda();      
			item.pegar();	
	
	/*Outra variável esta sendo criada*/
item = new Diamante(); 
			item.pegar();

	}

}
