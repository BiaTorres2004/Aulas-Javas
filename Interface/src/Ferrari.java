
public class Ferrari implements Automovel, ItemCaro {

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrarivirou a esquerda");
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrarivirou a direita");
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrarivirou acelerou");
		
	}

	@Override
	public double getPreco() {
		
		return 500000;
	}

          
}
