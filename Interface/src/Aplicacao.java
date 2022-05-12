
public class Aplicacao {

	public static void main(String[] args) {
	    Rota rota = new Rota(); 
	    Ferrari ferrari = new Ferrari(); 
//	    Fusca fusca = new Fusca();
//	    rota.ir(ferrari);
//	    System.out.println();
//	    rota.ir(fusca);
	    
//	    Automovel automovel = new Ferrari(); 
//	    Rota.ir(automovel);
//	    automovel = new Fusca();
//	    Rota.ir(automovel); 
	    
	    Vendedor vendedor = new Vendedor();
	    Apartamento apartamento = new Apartamento();
	    
	    vendedor.mostraPreco(apartamento);
	    vendedor.mostraPreco(apartamento);

	}

}
