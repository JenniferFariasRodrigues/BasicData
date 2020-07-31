package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;

	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary*percentage/100.0;
	}
	
//	Retornar as variaveis do programa
	public String toString() {
		return name
				+", $ "
				+"Salary without discont:  "
				+ String.format("%.2f", grossSalary)
				+ " ,Total salary with discont: $ "
				+ String.format("%.2f", netSalary());
	}

}
