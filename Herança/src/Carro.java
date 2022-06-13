/*classe filha*/ 

public class Carro extends Veiculo {
   
	private boolean quatroPortas;

/*Aqui puxara a informação da classe mãe*/
	@Override
	public void imprimir() {
		super.imprimir();
/*Verdadeirou ou falso*/ 
		System.out.println("Tem 4 portas " + quatroPortas);
	}

	@Override
	public boolean isQuatroPortas() {
		return quatroPortas; 
	}

/*Onde ela vai ser guardada*/
	@Override
	protected void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	
	                                }

	
