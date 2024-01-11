package task10Package;

import java.util.Scanner;

public class Q1Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get user inputs from the user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String names = sc.nextLine();
		System.out.print("Enter your age: ");
		int ages = sc.nextInt();

		// Pass user entered values stored in names and ages
		Person obj = new Person(names, ages);

		System.out.println("------------------------------");

		// Call the getter methods using the object.
		System.out.println("The entered user name is " + obj.getName());
		System.out.println("The entered user age is " + obj.getAge());

	}

}

class Person {
	private String name;
	private int age;

	// Constructor to assign values to instance variables
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter method to get names
	public String getName() {
		return name;
	}

	// Getter method to get age
	public int getAge() {
		return age;
	}

}