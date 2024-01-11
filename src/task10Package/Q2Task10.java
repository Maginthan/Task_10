package task10Package;

import java.util.Scanner;

public class Q2Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get input from user on the employee details
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Employee ID: ");
		int ID = sc.nextInt();
		System.out.println("Enter your Employee firstName: ");
		String FirstName = sc.next();
		System.out.println("Enter your Employee lastName: ");
		String LastName = sc.next();
		System.out.println("Enter your Employee salary: ");
		int Salary = sc.nextInt();
		System.out.println("Enter your Employee salary raised: ");
		int Raise = sc.nextInt();

		System.out.println("-------------------------------------");

		// Outputs for the entered inputs of employee details
		Employee obj = new Employee(ID, FirstName, LastName);
		System.out.println("Entered employee ID is: " + obj.getID());
		System.out.println("Entered employee firstName is: " + obj.getFirstName());
		System.out.println("Entered employee firstName is: " + obj.getLastName());
		System.out.println("Entered employee Name is:" + obj.getName());
		obj.setSalary(Salary);
		System.out.println("Employee raised as per entered percentage " + Raise + "% is: " + obj.raiseSalary(Raise));
		System.out.println("Entered employee salary is " + obj.getSalary());
		System.out.println("Employee's annual salary is " + obj.getAnnualSalary());
		System.out.println("Employee details are: " + obj.toString());
	}

}

class Employee {

	// Employee attributes
	int id;
	String firstName;
	String lastName;
	private int salary;

	// Employee constructor gets values from employee such as ID,salary,first
	// name....
	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// getting userId from user
	public int getID() {
		return id;
	}

	// getting firstName from user
	public String getFirstName() {
		return firstName;
	}

	// getting lastName from user
	public String getLastName() {
		return lastName;
	}

	// joining first name and last of the user
	public String getName() {
		return firstName + " " + lastName;
	}

	// setting salary of the user
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// getting salary of the user
	public int getSalary() {
		return salary;
	}

	// Annual salary calculated by multiplying salary * 12
	public int getAnnualSalary() {
		return salary * 12;
	}

	// Raise salary by user defined %
	public int raiseSalary(int percentage) {
		return (salary + (salary / 100) * percentage);
	}

	// Print employee details in a string
	public String toString() {
		return "Employee [id= " + id + ", " + "name = " + firstName + " " + lastName + ", " + "salary = "
				+ Integer.toString(salary) + "] ";
	}

}
