
public class Refrigerante extends Bebida {

	public Refrigerante() {
		
		super("Refrigerante", false);
		
	}

	@Override
	public void preparar() {

		System.out.println("Colocar Gelo");
		System.out.println("Colocar Refrigerante");
	}
	
	
}
