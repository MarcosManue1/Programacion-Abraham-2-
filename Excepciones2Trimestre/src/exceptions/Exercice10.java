package exceptions;
import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * Program that asks for a series of numbers until letters are inserted. 
 * The sum of all the inserted numbers must be displayed.
 * To do this, we want to use a method that asks for an integer and we want to control, 
 * within that method, the fact that it can insert letters. 
 * In this case, the method will display a message like this: "You have inserted letters instead of numbers".
 * Therefore, this method must control the error, 
 * but it must also throw it so that the main can receive the error, 
 * thus knowing that the exception has occurred and be able to close the program
 */

public class Exercice10 {

	public static void main(String[] args) {
		
		int total=0;
		boolean stop=false;
		Scanner keyboard = new Scanner (System.in);
		
		do {
			try {
			total+=askingIntegers(keyboard);
			}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Ok we finish");
			System.out.println(total);
			stop=true;
			}
			
		}while(!stop);
		
	}
		
	public static int askingIntegers(Scanner keyboard) {
		int num;
		try {
			num = keyboard.nextInt();
			return num;
			}catch(InputMismatchException e) {
				System.err.println("You have inserted letters instead of numbers");
				throw e;
			}
		
		}
	
		
	
	}


