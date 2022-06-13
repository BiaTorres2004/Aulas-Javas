
public class Aplicacao {

	public static void main(String[] args) {
		Conta conta1 = new Conta(1000.0 , 100.0);
		Conta conta2 = new Conta(1500.0 , 200.0); 
		
		Cliente cliente1 = new Cliente("Rafael", 333333, conta1 ); 
		Cliente cliente2 = new Cliente("Gislane", 444444, conta2 );
		
/*Teste boolean*/
		if(Cliente.getConta().sacar(100)==true) {
			System.out.println("Saque realizado com sucesso");
			
		}else {
			System.out.println("Saque não realizado porque seu saldo é insuficiente!!!");
			
		}
		
		System.out.println("Seu saldo atual é de" + Cliente.getConta().getSaldo()); 

/*Teste numero magicos*/
		
		switch(cliente1.getConta().sacarMN()) {
		case 100: System.out.println("Saque realizado com sucesso!!!"); 
		   break; 
		case 101 :System.out.println("Saque realizado com sucesso, mas você está usando seu limite");
		    break;
		case 102: System.out.println("Operação não realizada por você não ter limite suficiente");
		    break; 
		}
		
/*Teste exception*/
		try {
			cliente1.getConta().sacarEX(100); 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
			System.out.println("Não foi possivel realizar a operação" + e.getMessage());
		}
	}

}
