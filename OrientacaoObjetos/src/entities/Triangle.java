package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	//Acrencentando m�todo/fun��o para calcular  a �rea
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		}

}
