import java.util.Scanner;

public class Main_next_line {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		sc.nextLine() evita que a quebra de linha 
//		consuma o texto
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}
}