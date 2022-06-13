
public class LeiteQuente extends Bebida{

	public LeiteQuente () {
		super ("Leite Quente ", false); 
}

/*Aqui ela vai sobreescrever o metodo preparar. Isso também acontece no refrigerante*/ 	
	@Override
	public void preparar() {
		System.out.println("Colocando o leite no copo");
	}
	
	
	

                                  }
