
public class Conta {

	private double saldo; 
	private double limite;
	private double sacar; 
	
	
	public Conta(double d, double e) {
		
	}

	public boolean sacar(double valor ) {
		if (this.saldo< valor) { 
				return false; 
}
		
	this.saldo= valor; 
	return true; 
		
}

	public boolean transferir(Cliente cliente, double valor ) {
	if(this.saldo< valor) {
		return false; 
		
}
	this.saldo-=valor; 
	Cliente.getConta().depositar(valor); 
	    return true; 
}
	
/*Teste com numeros magicos*/
	public int sacarMN( double valor) {
		if((this.saldo< valor) && (this.saldo >=limite*-1)){
			return 102;
}
	return 100; 	
		
	}
	
	public int tranferirirMN(Cliente cliente, double valor) {
		
		if((this.saldo< valor) && (this.saldo >= limite*-1)) {
			return 101; 
		}
		else if((this.saldo< valor) && (this.saldo >=limite*-1)) {
			return 102; 
		}
		
		this.saldo=valor; 
		cliente.getConta();depositar(valor);  
		return 100;
	}
	
/*Teste com excepition*/
	
	public void sacarEX(double valor) throws ContaException {
		
	if(this.saldo<valor) {
		throw new ContaException("Saldo insuficiente"); 
		
}
	else if((this.saldo - valor) < limite*-1) {
		throw new ContaException("Limite insuficiente"); 
	}
		
}
	
   public void depositar(double valor) {
	   this.saldo=valor; 
	   
}

public double getSacar() {
	return sacar;
}

public void setSacar(double sacar) {
	this.sacar = sacar;
}
}
