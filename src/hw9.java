/* Derrick Fox
 * CS 213 31015
 * Homework 9 
 * hw9.java
 * April 1, 2014
 * Password Validator
 * 
 * This a password validator that makes sure a user enters a valid password given a set of rules.
 * 
 */

import java.util.Scanner;

public class hw9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		System.out.println("A valid password has at least 8 characters, 2 digits, and only characters and digits.");
		String password = input.nextLine();
		
		// boolean-switches to ensure all rules have been meet.
		boolean isEight = true;
		boolean isOnly = true;
		boolean isTwo = true;
	
		isEight = leastEightChars(password);
		isOnly = onlyLettersDigits(password);
		isTwo = leastTwoDigits(password);
		
		// if-else statement to determine and report validitiy to the user.
		if(isEight==true & isOnly==true & isTwo==true) {
			System.out.println("valid password");
		}
		else 
			System.out.println("invalid password");
	}
	
	// static method to make sure password contains at least 8 characters.
	public static boolean leastEightChars(String password) {
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			if(Character.isLetter(password.charAt(i)) )
				count = count + 1;
		}
		if(count >= 8)
			return true;
		else 
			return false;
	}
	
	// static method to make sure password contains only letters and digits.
	public static boolean onlyLettersDigits(String password) {
		boolean isValid = true;
		for(int i = 0; i < password.length(); i++) {
			if(Character.isLetterOrDigit(password.charAt(i))) {
				isValid = true;
			} 	
			else
				isValid = false;
		}
		if(isValid == true) 
			return true;
		else
			return false;
	}
	
	// static method to make sure password contains at least two digits.
	public static boolean leastTwoDigits(String password) {
		int count = 0;
		for(int i = 0; i < password.length(); i++) {
			if(Character.isDigit(password.charAt(i))) 
				count = count + 1;
		}
		if(count >= 2)
			return true;
		else
			return false;
	}
}
