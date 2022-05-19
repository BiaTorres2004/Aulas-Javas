import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// int x = 100;
		// double y = 200.5;
		// int a = 0;
		// double b = 0;
		// short z = (short) 100000;//casting explicito

		// System.out.println(z);
		// System.out.println();

		// x = (int) y;//casting implicito
		// y = x;

		// System.out.println(y);
		// System.out.println(x);

//		int idadePessoa = 18;
//		if (idadePessoa < 18) {
//			System.out.println("lol");
//		}else
//			System.out.println("vc pode beber mn");
//		System.out.println();
//		 
//		System.out.println("vc tem " + idadePessoa);

//		Scanner in = new Scanner(System.in);
//		int num = 1;

//		System.out.println("Digite um número para que eu possa auxília-lo no dia da semana");
//		num = Integer.parseInt(in.nextLine());
//
//		switch (num) {
//
//		case 1:
//			System.out.println("Segunda");
//			break;
//		case 2:
//			System.out.println("Terça");
//			break;
//		case 3:
//			System.out.println("Quarta");
//			break;
//		case 4:
//			System.out.println("Quinta");
//			break;
//		case 5:
//			System.out.println("Sexta");
//		case 6:
//			System.out.println("Sabádo");
//			break;
//		case 7:
//			System.out.println("Domingo");
//			break;
//		default:
//			System.out.println("Esse número eh invalido");
//			
//		}
//			char c = 'a';
//			
//			switch (c) {
//
//			case 'a':
//				System.out.println("Segunda");
//				break;
//			case 'b':
//				System.out.println("Terça");
//				break;
//			default:
//				System.out.println("valor inválido");
//				
//			}
			
//			String cor;
//			
//			System.out.println("Qual a cor do farol?");
//			cor = in.next();
//			
//			
//			switch (cor) {
//
//			case "Vermelho":
//				System.out.println("Pare.");
//				break;
//			case "Amarelo":
//				System.out.println("Tenção");
//			case "Verde":
//				System.out.println("Dale mn");
//				break;
//			default:
//				System.out.println("valor inválido");
//		}
		
//		int x = 0;
//		while(x<10) {//testar para depois executar
//		System.out.println(x);
//		x++;
//			
//		}
//		
//		x=0;
//		do {//ele executa primeiro, independente e dps faz o teste
//			System.out.println(x);
//			x++;
//		}while(x<10);
		
		
		
		
//		for(int x=0; x>-10; x--) {
//			System.out.println(x);
		
	int[] arrayQualquer = new int[3];
	Object[] arrayObject = new Object[6];
	
	arrayObject[0] = 12;
	arrayObject[1] = "Beatriz";
	arrayObject[2] = 13.8;
	arrayObject[3] = true;
	arrayObject[5] = arrayQualquer;
	
	for (int aux2 = 0; aux2 < arrayObject.length; aux2++) {
		System.out.println("Indice " +aux2+ " = " + arrayObject[aux2]);
		
		int[][] arrayBidericional = new int [4][3]; 
		
	arrayBidericional[0][0]=8;
	arrayBidericional[2][1]=7;
	
	for (int linha = 0; linha < arrayBidericional.length; linha++) {
		for (int coluna = 0; coluna < arrayBidericional[0].length; coluna++) {
			System.out.print("Indice [" +linha+ "]["+coluna +"] =" + arrayBidericional[linha][coluna]+" ");
			
			
		}
		System.out.println();
		
	}
	
		
	}
	
	
	
	}
}

	

		
