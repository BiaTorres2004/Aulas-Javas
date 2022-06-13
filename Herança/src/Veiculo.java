/*O que é herança: São classes que que herdam atributos é metódos da classe mãe*/
/*Essa aqui é classe mãe*/

public class Veiculo {
    
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

/*O protected NÃO pode ser acessado fora da classe*/
	protected String marca; 
	protected String modelo; 
	protected int ano; 
	
	public void buzinar() {
        System.out.println("BI BI");
}
/*Informações do veiculo que vão aparecer*/
	public void imprimir() {
		System.out.println("Marca:" + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("Ano:" + ano);
	}
	public boolean isQuatroPortas() {
		// TODO Auto-generated method stub
		return false;
	}
	protected void setQuatroPortas(boolean quatroPortas) {
		// TODO Auto-generated method stub
		
	}
	
	
                     }
