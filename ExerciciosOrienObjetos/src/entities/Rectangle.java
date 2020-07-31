package entities;

public class Rectangle {
	public double width;
	public double height;
	public double doubleWidth;
	public double doubleHeight;
	public double  totallenght;
//	cálculo da área
	public double totalArea() {
		return width * height;
	}
	
//	cálculo do perímetro
	public double totalPerimeter() {
		return 2*(width+height);
	}

//	cálculo da diagonal
	public double totalDiagonal() {
		doubleWidth = Math.pow(width, 2.0);
		doubleHeight = Math.pow(height, 2.0);
		totallenght = doubleWidth+ doubleHeight;
		return Math.sqrt(totallenght);
	}
}
