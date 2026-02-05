package exceptions;

import javax.swing.JOptionPane;

public class Practice {

	static int age;
	static float height;
	
	
	public static void main(String[] args) {
		
		askAge();
		
		boolean exit=false;
		
		do {
		try {
			setHeight();
			exit=true;
		} catch (NegativeNumberException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage(),null,age);
		}
		}while(exit==false);
		print();
		
	}
	
	public static void print() {
		System.out.println("your age is -->"+age);
		System.out.println("your height is -->"+height);
	}
	
	public static void setHeight() throws NegativeNumberException{
		height= askFloat("Give me the user height");
		if(height<=0) {
			throw new NegativeNumberException("Negative height");
		}
	}
	
	public static float askFloat(String message) {
		String auxStr=JOptionPane.showInputDialog(message);
		try {
		return Float.parseFloat(auxStr);		
			}catch(NumberFormatException e) {
				System.err.println("BAD VALUE");
				return -1;
			}catch(NullPointerException e){
				System.exit(0);
			}
		return age;
	}
		public static void askAge() {
		String auxStr=JOptionPane.showInputDialog("Give me the user age");
		try {
		age=Integer.parseInt(auxStr);		
			}catch(NumberFormatException e) {
				age=-1;
				System.err.println("BAD VALUE");
			}
		}
		
}
