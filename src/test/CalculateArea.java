package test;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//Area of Rectangle
		System.out.println("Enter Length of Rectangle: ");
		float length=sc.nextFloat();
		System.out.println("Enter Breadth of rectangle: ");
		float breadth=sc.nextFloat();
		float rectangle_area=length*breadth;
		System.out.println("Area of Rectangle is: "+rectangle_area);
		
		//Area of Square
		System.out.println("Enter Side of the Square: ");
		float side=sc.nextFloat();
		float square_area=side*side;
		System.out.println("Area of Square is: "+square_area);
		
		//Area of Circle
		System.out.println("Enter Radius of the Circle: ");
		float radius=sc.nextFloat();
		float circle_area=(float) (3.14*radius*radius);
		System.out.println("Area of CIrcle is: "+circle_area);
		
		sc.close();

	}

}
