import java.util.Scanner;

public class CalculadoradeArea {
	public static void main(String[] args) {
		
		int nome;
		
		Sistema sistema = new Sistema();
		Scanner entrada = new Scanner(System.in);


		System.out.println("<---- Calcular Area ---->");
		
		
		System.out.println("1-Quadrado Largura 15 e altura 15");
		System.out.println("2-Triângulo Largura 7.5 e altura 10.15");
		System.out.println("3-Retângulo Largura 15 e Altura 10");
		System.out.println("Digite a figura escolhida 1,2 ou 3");
		nome = entrada.nextInt();
		

		if(nome == 1) {
		int area = sistema.CalArea(15, 15);
		System.out.println("A Àrea do Quadrado é " + area);
		}
		
		else if(nome == 2 ) {
		double area = sistema.CalArea(7.5, 10.15);
		System.out.println("A Àrea do Triãngulo é " + area);
			}
		
		else {
		int area = sistema.CalArea(15, 10);
		System.out.println("A Àrea do Retângulo é " + area);
		}
			
				
		}
}
