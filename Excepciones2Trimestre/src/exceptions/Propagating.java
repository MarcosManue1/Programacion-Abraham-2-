package exceptions;

import java.util.Scanner;

public class Propagating {
		
	public static void main(String[] args) {
		int num=askInteger("Give me an integer");
		System.out.println("Your name is= "+num);
	}
	
	public static int askInteger(String message){
		String auxStr;
		auxStr=askString(message);
		int auxInt=Integer.parseInt(auxStr);
		return auxInt;
		
	}
	
	public static String askString(String message){
		Scanner keyboard= new Scanner(System.in);
		String auxStr;
		System.out.println(message);
		auxStr=keyboard.nextLine();
		return auxStr;
	}

}
