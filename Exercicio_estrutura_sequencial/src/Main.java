import java.util.Locale;
import java.util.Scanner; // Import the Scanner class

public class Main {

	public static void main(String[] args) {
//////		Exercicio1:Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//		mensagem explicativa, conforme exemplos.
//		a)entrada:10,30, saida:SOMA:40
//		int x = 10;
//		int y = 30;
//		int z = x+y;
//		System.out.println("SOMA="+ z);

//// b):entrada:-30,10, saida:SOMA:-20
//		int x = -30;
//		int y = 10;
//		int z = x+y;
//		System.out.println("SOMA="+ z);

////c)entrada:0,0, saida:SOMA:0
//		int x = 0;
//		int y = 0;
//		int z = x+y;
//		System.out.println("SOMA="+ z);

////	Exercicio2:	Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
////		casas decimais conforme exemplos.
////		Fórmula da área: area = π . raio2
////		Considere o valor de π = 3.14159
//				
//		Scanner sc = new Scanner(System.in);
//		double pi = 3.14156;
//		double raio = 150.00;
//		double A;
//		
//		A= pi*(Math.pow(raio, 2.0));
//		System.out.println("A="+A);

////Exercicio3:Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
////de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
//
//		Scanner sc = new Scanner(System.in);
//		int A, B,C,D, Diferenca;
//		
//		System.out.println("Digite A:");
//		
//		A = sc.nextInt();
//		
//		System.out.println("Digite B:");
//		B= sc.nextInt();
//		System.out.println("Digite C:");
//		C= sc.nextInt();
//		System.out.println("Digite D:");
//		D=sc.nextInt();
//		
//		Diferenca=A*B-C*D;
//		System.out.println("DIFERENCA:"+Diferenca);
//		sc.close();

////Exercicio4:Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
////hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
////decimais.
////		
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		double  numeroHoras,valorRecebido, salario;
//		int numeroFuncionario;
//		System.out.println("Digite numeroFuncionario:");
//		
//		numeroFuncionario = sc.nextInt();
//		
//		System.out.println("Digite numeroHoras:");
//		numeroHoras= sc.nextDouble();
//		System.out.println("Digite valorRecebido:");
//		valorRecebido= sc.nextDouble();
//		
//		
//		salario = numeroHoras*valorRecebido;
//		System.out.println("Number="+numeroFuncionario);
//		System.out.println("SALARY=U$"+salario );
//		sc.close();
//
////	Exercicio5:Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
////	código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		double valorpeca1, valorpeca2,valorTotalPeca1,valorTotalPeca2,valorTotalPecas;
//		int codigopeca1, numeropecas1, codigopeca2, numeropecas2;
//		System.out.println("Digite codigopeca1:");
//
//		codigopeca1 = sc.nextInt();
//
//		System.out.println("Digite numeropecas1:");
//		numeropecas1 = sc.nextInt();
////		Locale.setDefault(Locale.US);
//		System.out.println("Digite valorpeca1:");
//		valorpeca1 = sc.nextDouble();
//
////		Para peca2
//
//		System.out.println("Digite codigopeca2:");
//
//		codigopeca2 = sc.nextInt();
//
//		System.out.println("Digite numeropecas2:");
//		numeropecas2 = sc.nextInt();
////		Locale.setDefault(Locale.US);
//		System.out.println("Digite valorpeca2:");
//		valorpeca2 = sc.nextDouble();
//
//		valorTotalPeca1 = numeropecas1 * valorpeca1;
////		System.out.println("Valor a pagar peça1=" + valorTotalPeca1);
//		
//		valorTotalPeca2 = numeropecas2 * valorpeca2;
////		System.out.println("Valor a pagar peça2=" + valorTotalPeca2);
//		
//		valorTotalPecas=valorTotalPeca1+ valorTotalPeca2;
//		System.out.println("Valor total a pagar=R$" + valorTotalPecas);
//		sc.close();
		
		
//Exercicio6:Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//		mostre:
//		a) a área do triângulo retângulo que tem A por base e C por altura.
//		b) a área do círculo de raio C. (pi = 3.14159)
//		c) a área do trapézio que tem A e B por bases e C por altura.
//		d) a área do quadrado que tem lado B.
//		e) a área do retângulo que tem lados A e B.
		
		Locale.setDefault(Locale.US);
		
		Scanner pr = new Scanner(System.in);// Create a Scanner object
		double areaTriangulo,areaCirculo,areaTrapezio,areaQuadrado,areaTriangulo1, areaRetangulo;
		double pi = 3.14159, A,B,C;
		
		System.out.println("Digite A:");
		A = pr.nextDouble();
		
		System.out.println("Digite B:");
		B = pr.nextDouble();
		
		System.out.println("Digite C:");
		C = pr.nextDouble();
		
		areaTriangulo1 = A*C/2;
		areaCirculo = pi* (Math.pow(C, 2));
		areaTrapezio = (A+B)/2*C;
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = A*B;
		
		System.out.printf("Area do triangulo : %.3f%n ", areaTriangulo1);
		System.out.printf("Area do circulo: %.3f%n",areaCirculo);
		System.out.printf("Area trapézio:%.3f%n", areaTrapezio);
		System.out.printf("Area quadrado:%.3f%n",areaQuadrado);
		System.out.printf("Area retângulo:%.3f%n",areaRetangulo);
		pr.close();
	}

}
