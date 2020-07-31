
/* Fazer um programa para ler um n�mero inteiro N e depois os 
dados (id, nome e salario) de N funcion�rios. N�o deve haver 
repeti��o de id. 
 
Em seguida, efetuar o aumento de X por cento no sal�rio de 
um determinado funcion�rio. Para isso, o programa deve ler 
um id e o valor X. Se o id informado n�o existir, mostrar 
uma mensagem e abortar a opera��o. Ao final, mostrar a 
listagem atualizada dos funcion�rios, conforme exemplos.
 
Lembre-se de aplicar a t�cnica de encapsulamento para n�o 
permitir que o sal�rio possa ser mudado livremente. Um 
sal�rio s� pode ser aumentado com base em uma opera��o 
de aumento por porcentagem dada.
Fonte:OO e List em Java - Aul�o #003
https://www.youtube.com/watch?v=Xj-osdBe3TE&feature=youtu.be
*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//List generics:Especifica o tipo de objeto no caso Employee. 
//Tipo list=interface.N�o � classe.
//Estancia a interface com classe concreta que implementa a interface.Usar LinkedList ou ArrayList
		List<Employee> list = new ArrayList<>();
		
//Part1 1: Reading data
		System.out.print("How many employees will be registered? ");
		int numberEmployees = sc.nextInt();
		
		for (int i=0; i<numberEmployees; i++) {
//			para dar espa�o
			System.out.println();
//			i+1 pois o for come�a do 0
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			
//Integer,Double tipo classe,wrapper do Java.Aceita null.
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
//Part 2:Updating salary of given employee
			System.out.print("Name: ");
//			Para n�o consumir a quebra de linha da entrada do id.
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id,name,salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();
		
//Outra maneira de encontar a posi��o do id. Ligado a Fun��o Integer position
		// Integer pos = position(list, idsalary);
		
//		Verificar se existe o id atrav�s do stream.Aceita fun��es de alta ordem.
//Fun��o filter,filtra a lista para  somente os elementos solicitados.Funcion�rios
//com o idSalary e pega o primeiro findFirst.Se n�o existir retorna nulo.
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
//Outra maneira de encontar a posi��o do id
		// if (pos == null) {
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
//Outra maneira de encontar a posi��o do id
			//list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
//Para saltar uma linha ao rodar
		System.out.println();
		System.out.println("List of employees:");
		for (Employee e : list) {
			System.out.println(e);
		}		
		
		sc.close();
	}

	
	// Fun��o auxiliar para procurar elemento na lista.Retorna a posi��o
	// do elemento na lista.Static,pois o mais � static
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	
	public static boolean hasId(List<Employee> list, int id) {
//Lambda:list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
//Se retornar verdadeiro,encontrou funcion�rio.
		return emp != null;
	}
}