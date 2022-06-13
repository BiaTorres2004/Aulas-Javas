public class Aplicacao {

	public static void main(String[] args) {
		
/Aqui o preparador vai ser instaciado e isso também acontece no leite-quente e no refrigerante*/ 
		Preparador preparador = new Preparador();
		
		LeiteQuente leiteQuente = new LeiteQuente();
/Aqui ele está chamando o leite-quente no metodo preparar*/ 
		preparador.prepararBebidas(leiteQuente);
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebidas(refrigerante);

	}

}
