package entities;

public class Rectangle {
	public double width;
	public double height;
	public double doubleWidth;
	public double doubleHeight;
	public double  totallenght;
//	c�lculo da �rea
	public double totalArea() {
		return width * height;
	}
	
//	c�lculo do per�metro
	public double totalPerimeter() {
		return 2*(width+height);
	}

//	c�lculo da diagonal
	public double totalDiagonal() {
		doubleWidth = Math.pow(width, 2.0);
		doubleHeight = Math.pow(height, 2.0);
		totallenght = doubleWidth+ doubleHeight;
		return Math.sqrt(totallenght);
	}
}
