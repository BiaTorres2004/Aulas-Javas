
public class Conta {
	
	String nome;
	double valor;

/*Aqui a fonte está sendo construida*/ 
	public Conta(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
/
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}
	
	
}
