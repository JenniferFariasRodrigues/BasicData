package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class MainRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rectangle rect  = new Rectangle();
	
		
		System.out.println("Enter the measures of rectangle:width and heigth: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		
		
		System.out.printf("Rectangle area: %.2f%n", rect.totalArea());
		System.out.printf("Rectangle perimeter: %.2f%n", rect.totalPerimeter());
		System.out.printf("Rectangle diagonal: %.2f%n", rect.totalDiagonal());
		
		sc.close();
	}

}
