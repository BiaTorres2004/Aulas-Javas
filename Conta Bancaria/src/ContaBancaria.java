
public class ContaBancaria {

	private int numConta;
	private double saldo;
	private boolean ativo;
	
	//Isso faz com que a  inicialização tenha um valor predefinido
	public ContaBancaria() {
		numConta = 1 ;
		saldo = 1.0;
		ativo = true;
	}
	
	

	public ContaBancaria(boolean ativo, int numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.ativo = ativo;
	}



	//Metodo de receber
	public void Receber(double valor){
		saldo += valor;
		
	}
	
	//Metodo de Ver
	public double Ver() {
		return saldo;
	}
	
	//Metodo de Dar
	public void Dar(double valor) {
		if (saldo >= valor) {
		saldo -= valor;
		} else {
			System.out.println("Você não tem dinheiro suficiente na conta!");
		}
	}
}
