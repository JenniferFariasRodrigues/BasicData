package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class MainEmployeer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp= new Employee();
		System.out.println("Nome do funcionário:");
		emp.name = sc.nextLine();
		System.out.println("Salário:");
		emp.grossSalary = sc.nextDouble();
		System.out.print("Imposto:");
		emp.tax = sc.nextDouble();
		
//		Chamando pela função toString
		System.out.println();
		System.out.println("Nome: "+ emp);
		
		System.out.println();
		System.out.println("Porcentagem de imposto para acrescentar?:");
		double percentage = sc.nextDouble();
		emp.increaseSalary( percentage);
		
		System.out.println();
		System.out.println("Updated data: "+ emp);
		
		
		
		sc.close();

	}

}
