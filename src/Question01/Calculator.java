package Question01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculate area and peremeter of Triangle");
		System.out.print("Enter first side length of triangle :: ");
		float side1 = scan.nextFloat();
		System.out.print("Enter second side length of triangle :: ");
		float side2 = scan.nextFloat();
		System.out.print("Enter base side length of triangle :: ");
		float base = scan.nextFloat();
		System.out.print("Enter height of triangle :: ");
		float height = scan.nextFloat();
		
		IShape triangleShape = new TriangleImpl(side1, side2, base, height);
		float areaOfTriangle = triangleShape.area();
		System.out.println("Area of Triangle is :: "+ areaOfTriangle);
		
		System.out.println();
		float perimeterOfTriangle = triangleShape.perimeter();
		System.out.println("Perimeter of Triangle is :: "+perimeterOfTriangle); 
		
		System.out.println();
		System.out.println("Calculate area and peremeter of Circle");
		System.out.print("Enter radius of Circle :: ");
		float radius = scan.nextFloat();
		
		IShape circleShape = new CircleImpl(radius);
		float areaOfCircle = circleShape.area();
		System.out.println("Area of Circle is :: "+ areaOfCircle);
		System.out.println();
		
		float perimeterOfCircle = circleShape.perimeter();
		System.out.println("Perimeter of Circle is :: "+perimeterOfCircle); 
		
		
		scan.close();
		
	}

}
