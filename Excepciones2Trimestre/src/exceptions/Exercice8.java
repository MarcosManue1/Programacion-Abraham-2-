package exceptions;

/*
 * Write a program that creates and initializes an array 
 * and handles the exception that we
access an index that is out of range
 */

public class Exercice8 {

	public static void main(String[] args) {

		        // Crear e inicializar el arreglo
		
		        int[] numeros = {10, 20, 30, 40, 50};

		        try {
		            // Intentar acceder a un índice fuera del rango
		        	
		            System.out.println("Elemento en la posición 10: " + numeros[10]);
		            
		        } catch (ArrayIndexOutOfBoundsException e) {
		        	
		            // Manejo de la excepción
		        	
		            System.out.println("Error: Estás intentando acceder a un índice fuera del rango del arreglo.");
		        }

		        System.out.println("El programa continúa ejecutándose normalmente.");
		    }
		}

	


