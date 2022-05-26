
public class Conta {
	
	String nome;
	double valor;

//construting source
	public Conta(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
//to string
//para não mostrar o endereço e sim o conteudo da variavel das contas
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}
	
	
}
