public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador preparador = new Preparador();
		
		LeiteQuente leiteQuente = new LeiteQuente();
		preparador.prepararBebidas(leiteQuente);
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebidas(refrigerante);

	}

}
