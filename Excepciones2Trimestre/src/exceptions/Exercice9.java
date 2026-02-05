package exceptions;

import java.util.InputMismatchException;

import utility.AskUser;

/*
 * Write a program that asks for numbers, in order to display the result of adding all the inserted numbers. 
 * Numbers will be requested until a letter is inserted or until five numbers are inserted. 
 */

public class Exercice9 {

	public static void main(String[] args) {
		
		int count = 0;
        int sum = 0;

        while (count < 5) {
            try {
                sum += AskUser.askInt(
                    "Give me a number (a letter will stop the program): "
                );
                count++;
            } catch (InputMismatchException e) {
                System.out.println("You gave a letter, bye");
                break;
            }
        }

        System.out.println("Sum of inserted numbers: " + sum);
	}
}
