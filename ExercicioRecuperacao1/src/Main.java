import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner teclado =  new Scanner (System.in);
		List<Funcionario> lista = new ArrayList<Funcionario>();
		Calculo calculo = new Calculo();
		Funcionario funcionario1 = new Funcionario (); 
		Funcionario funcionario2 = new Funcionario ();
		
		System.out.println("Digite seu nome");
		Funcionario.getNome(teclado.next());
		
		System.out.println("Digite seu idade");
		Funcionario.getIdade(teclado.next());
		
		System.out.println("Digite seu cpf");
		Funcionario.getCpf(teclado.next());
		
		System.out.println("Digite seu salario");
		double x = scanner.nextDouble();
		
		
		
		System.out.println("Digite seu nome");
		Funcionario.getNome(teclado.next());
		
		System.out.println("Digite seu idade");
		Funcionario.getIdade(teclado.next());
		
		System.out.println("Digite seu cpf");
		Funcionario.getCpf(teclado.next());
		
		System.out.println("Digite seu salario");
		double y = scanner.nextDouble();
		
	
		


		
		
		
	}

	
}
