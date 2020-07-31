import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 40;
		double x =10.56448;
		/* Imprime variaveis */
//		System.out.println(y);
//		System.out.println(x);
		
		/* Numeros ponto flutuante */
//		System.out.printf("%.2f%n",x); 
//		System.out.printf("%.5f\n",x);
		
		/* Imprime com ponto */
		Locale.setDefault(Locale.US);
//		System.out.printf("%.4f%n", x);
//		System.out.println("RESULTADO = " + x + " METROS");
		
		/* Imprime strings */
//		System.out.println("Hi,good afternoon.I'm Jennifer");
//		System.out.print("I'm here");
		
		/*
		 * concatenar vários elementos em um mesmo comando de escrita
		 */
//		System.out.printf("RESULTADO = %.2f metros %n", x);
		
		/*
		 * concatenar vários elementos em um mesmo comando de escrita
		 */
		String nome = "Jennifer";
		int idade = 34;
		double renda = 7000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
