
public class Preparador  {
	public void prepararBebida(Bebida bebida){
		
	System.out.println("Preparando a bebida " + bebida.getNome());
	
	System.out.println("Pegar Copo");
	
	bebida.preparar();
	
	
	if(bebida.isAquecer()) {
		System.out.println("Aquecer Bebida " + bebida.getNome());
	}
	
	System.out.println("Preparada ;) \n");
	}

}
