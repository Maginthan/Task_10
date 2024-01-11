package task10Package;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q4Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Get input from user on the bank details
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String Name = sc.next();
		System.out.println("Enter your balance amount: ");
		float Balance = sc.nextFloat();

		System.out.println("-------------------------------------");

		// Printing the output to user based on the user details entered
		Account obj = new Account(Balance, Name);

		// Get user input for deposit amount
		System.out.println("Enter your deposit amount: ");
		float Deposit = sc.nextFloat();
		obj.deposit(Deposit);

		System.out.println("-------------------------------------");

		// Get user input for withdraw amount
		System.out.println("Enter your withdrawl amount: ");
		float Withdrawl = sc.nextFloat();
		obj.withdraw(Withdrawl);

		System.out.println("-------------------------------------");

		// Calling constructor with no arguments
		Account obj1 = new Account();
		System.out.println();
		obj.deposit(Deposit);
		obj.withdraw(Withdrawl);

	}

}

class Account {
	private float balance;
	String name;

	// Used to format the decimal to .00
	DecimalFormat df = new DecimalFormat("#.##");

	// Constructor with no arguments
	public Account() {
		System.out.println("Calling a constrcutor with no arguments");
	}

	// Constructor with two arguments
	public Account(float balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	public void withdraw(float Amount) {

		if (Amount > balance) {
			System.out.println("The entered withdrawl amount is greater than the balance amount");
			System.out.println("The final balance present in you account is: " + df.format(balance));
		} else {
			balance -= Amount;
			System.out.println("The amount " + df.format(Amount) + " is withdrawed from your account");
			System.out.println("The final balance present in you account is: " + df.format(balance));
		}

	}

	public void deposit(float Amount) {

		System.out.println("The amount " + df.format(Amount) + " is deposited to your bank account");
		balance += Amount;
		System.out.println("The final balance present in you account is: " + df.format(balance));

	}

}