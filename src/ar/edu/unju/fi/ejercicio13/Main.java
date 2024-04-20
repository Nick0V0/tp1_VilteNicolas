package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[8];
		
		// Almacenar números enteros al array
		for(int i = 0 ; i != 8 ; i++) {
			System.out.print("Ingrese un numero entero para ARRAY" + "[" + i +"]: ");
			while(!scanner.hasNextInt()) {
				System.out.println("No es un numero entero" );
				System.out.print("Ingrese un numero entero para ARRAY" + "[" + i +"]: ");
				scanner.next();
			}
			array[i]=  scanner.nextInt();
		}
		
		// Muestra el índice y el valor del array
		for(int i = 0 ; i!=8 ; i++) {
			System.out.println("ARRAY" + "[" + i + "]: " + array[i]); 	
		}

	}

}
