package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class MainMembrosEstatico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double amount = sc.nextDouble();
		
		
		double TotalPrice = CurrencyConverter.dollarTotal(  amount,  dollarPrice);
		
		System.out.printf("Amount to be paid in reais = R$ %.2f%n",TotalPrice);
		
		sc.close();

	}

}
