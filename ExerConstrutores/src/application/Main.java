package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		Declara a vari�vel para ser usada em todo o programa.
//		Atribui um objeto a classe
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
//		Para consumir a quebra de linha anterior
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response=='y') {
			System.out.print("Enter initial deposit value: ");
			
			double initialDeposit = sc.nextDouble();
//			Instanciar a conta. Sobrecarga
			account = new Account(number, holder, initialDeposit);
			
		}else {
			account = new Account(number, holder);
			
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withDrawValue = sc.nextDouble();
		account.withDraw(withDrawValue);
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(account);
		sc.close();

	}

}
