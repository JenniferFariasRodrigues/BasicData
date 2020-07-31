
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		
		
//		System.out.println("Digite algo: \n");
//		x = sc.next();
//		System.out.println(" Voce digitou:" + x);
		
		/* Ler numero inteiro */
//		int y;
//		System.out.println("Digite um numero: ");
//		y = sc. nextInt();
////		System.out.printf("Digite um numero: %f \n",y);
//		
//		System.out.println("O numero digitado eh: " + y);
		
		/* Ler variaveis double */
		
//		double y;
//		System.out.println("Digite um numero: ");
//		
//		y = sc. nextDouble();
////		System.out.printf("Digite um numero: %.2f \n",y);
//		
//		System.out.println("O numero digitado eh: " + y);
		
		/* Ler caracteres */
//		char caracter ;
//		caracter = sc.next().charAt(1);
//		System.out.println("Voce digitou:" + caracter);
		
		/* Ler varios tipod de dados */
		
		String name;
		int number;
		double number2;
		System.out.println("Digite nome, idade e peso: ");
		name = sc.next();
		number = sc.nextInt();
		number2 = sc.nextDouble();
//		System.out.println("Dados digitados:");
//		System.out.println(name);
//		System.out.println(number);
//		System.out.println(number2);
		System.out.println("Dados sao:" + name + number + number2);
		
		sc.close();

	}

}
