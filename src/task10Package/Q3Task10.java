package task10Package;

import java.util.Scanner;

public class Q3Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get input from user on the employee details
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		float Radius = sc.nextInt();
		System.out.println("Enter the color of the circle: ");
		String Color = sc.next();

		System.out.println("-------------------------------------");

		// Outputs for the circumference based on the radius5
		System.out.println("Calling a constrcutor with two arguments");
		System.out.println();
		Circle obj = new Circle(Radius, Color);
		System.out.println("The circumference of the circle with radius " + Radius + " is: "
				+ (obj.calculateCircumference()) + " with color " + Color);

		System.out.println("-------------------------------------");

		// Calling constructor with no arguments
		Circle obj1 = new Circle();
		System.out.println();
		System.out.println("The circumference of the circle with radius " + Radius + " is: "
				+ (obj.calculateCircumference()) + " with color " + Color);
	}

}

class Circle {

	float radius;
	String color;
	float radius2;

	// Constructor with no arguments
	public Circle() {
		System.out.println("Calling a constrcutor with no arguments");
	}

	// Constructor with two arguments
	public Circle(float radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	// Method to calculate the Circumference of the circle
	public float calculateCircumference() {
		return (22.0f / 7.0f) * 2 * radius;
	}
}