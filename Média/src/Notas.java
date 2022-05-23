
public class Notas {

	//Exercicío 1
	public static void main(String[] args) {
		double nota1 = 8.5;
		double nota2 = 7.5;
		double nota3 = 6.0; 
		double median1;
		double median2;
		double median3;
		double mediag;
		double somap = 10;
		
	
		System.out.println("Primeira nota " + (nota1));
		System.out.println("Segunda nota " + (nota2));
		System.out.println("Terceira nota " + (nota3));
		System.out.println("-----------------------------------");
		
		
		System.out.println("O peso da nota 1 é 3 ");
		System.out.println("Então o resultado dela é " +(median1 = nota1 * 3));
		
		System.out.println("O peso da nota 2 é 2"  );
		System.out.println("Então o resultado dela é " +(median2 = nota2 * 2));
		
		System.out.println("O peso da nota 3 é 5"  );
		System.out.println("Então o resultado dela é " +(median3 = nota3 * 5));
		System.out.println("-----------------------------------");
		
		System.out.println("Média do Peso das Notas " +(mediag = median1 + median2 + median3));
		System.out.println("Média Total: " + (mediag / somap));
	}

}
