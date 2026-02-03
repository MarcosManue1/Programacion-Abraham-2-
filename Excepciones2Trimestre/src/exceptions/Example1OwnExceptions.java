package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1OwnExceptions {

	public static void main(String[] args) throws IntervalException {
		
		Scanner keyboard = new Scanner(System.in);
		
		try {
			while(true)
			checkRange(keyboard);
		}catch(Exception e) {
		checkRange(keyboard);
		}
	}
	
	public static int checkRange(Scanner keyboard) throws IntervalException{
		int num=0;
		num=askingIntegers(keyboard);
		
		if(num<1||num>10) {
			throw new IntervalException("Number out of Range");
		}else {
			return num;
		}
	}

	public static int askingIntegers(Scanner keyboard) {
		int num;
		try {
			num = keyboard.nextInt();
			return num;
			}catch(InputMismatchException exc) {
				System.err.println("You have inserted letters instead of numbers");
				throw new InputMismatchException("You give me a letter");
			}
		
		}
}
