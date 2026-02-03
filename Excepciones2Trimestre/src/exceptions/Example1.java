package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int num = 0;
		boolean repeat=false;
		do {
			try {
				System.out.println("Give a me a number");
				num = keyboard.nextInt();
				int sol=100/num;
				System.out.println("Solution is "+sol);
				repeat=false;
			}catch(InputMismatchException inExc) {
				System.out.println("BAD INPUT");
				repeat=true;
				
			}catch(ArithmeticException exc) {
				System.out.println("Multiply yourself by 0");
				repeat=true;
				
		}catch (Exception exc) {
				
				exc.printStackTrace();
				repeat=true;
				
			}finally {
				keyboard.nextLine();
			}
			
			
		} while (repeat);
		System.out.println("your num= " + num);
 
	}

}
