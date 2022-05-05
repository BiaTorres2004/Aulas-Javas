
public class Carro extends Veiculo {
   
	private boolean quatroPortas;

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tem 4 portas " + quatroPortas);
	}

	@Override
	public boolean isQuatroPortas() {
		return quatroPortas; 
	}

	@Override
	protected void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

	
	                                }

	