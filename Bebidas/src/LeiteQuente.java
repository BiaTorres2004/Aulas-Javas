
public class LeiteQuente extends Bebida {

	public LeiteQuente() {
		super("Leite Quente", true);
	}

	@Override
	public void preparar() {
		System.out.println("Pegar o leite");
		System.out.println("Colocar no copo");
	}
	
	

}
