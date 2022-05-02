import java.awt.SystemColor;

public class Aplicação {

	public static void main(String[] args) {
		
		Matemática matemática = new Matemática();
		
		//t resultado = matemática.somar(2, 3);
		//stem.out.println(resultado);
		//sultado = matemática.subtrair(10, 4); 
		//stem.out.println(resultado);
        
		int resultado = Matemática.somar(2,4);
		System.out.println(resultado);
		resultado = Matemática.subtrair(10,1);
		System.out.println(resultado);
	}
//       Contador1 contador1 = new Contador();
//       Contador2 contador2 = new Contador();
//       Contador3 contador3 = new Contador();
	
//       System.out.println(contador1.getValor());
//       System.out.println(contador1.getValor());
//       System.out.println(contador1.getValor());
//       
    contador1.incrementar();
}
