package Question03;

import java.util.Scanner;

class NegativeNumberException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public NegativeNumberException(String message) {
		super(message);
	}
}

class User{
	Scanner scan = new Scanner(System.in);
	int num1;
	public void input() {
		System.out.print("Enter any positive number :: ");
		num1 = scan.nextInt();
	}
	
	public void verify() throws NegativeNumberException { 
		if(num1 < 0) {
			NegativeNumberException nne = new NegativeNumberException("Entered number is negative please enter positive number");
			System.out.println(nne.getMessage());
			throw nne;
		} else {
			System.out.println("Entered number is :: "+num1+" and its positive number");
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		
		User user = new User();
		try {
			user.input();
			user.verify();
		} catch (NegativeNumberException e) {
			try {
				user.input();
				user.verify();
			} catch (NegativeNumberException e2) {
				try {
					user.input();
					user.verify();
				} catch (NegativeNumberException e3) {
					System.out.println("Still number is negative try again later !");
				}
			}
		}
		
	}
}
