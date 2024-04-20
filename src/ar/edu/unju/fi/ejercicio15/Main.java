package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Creacion de array
		int tamaño = 0;
		do {
			System.out.print("ingrese por consola un número entero, que se encuentre en el rango [5,10]:");
			while(!scanner.hasNextInt()) {
				System.out.println("No es un numero entero" );
				System.out.print("ingrese por consola un número entero, que se encuentre en el rango [5,10]:");
				scanner.next();
			}
			tamaño = scanner.nextInt();
			scanner.nextLine();
		}while(!((tamaño >= 5) && (tamaño <= 10)));
		String[] array = new String[tamaño];
		
		// Solicitar los nombres de la persona
		for(int i = 0 ; i!=tamaño ; i++) {
			System.out.print("ingrese un nombre de personas para guardarlo en el ARRAY" + "[" + i +"]: ");
			array[i] = scanner.next();
			scanner.nextLine();
		}
		
		// Mostrar el índice,el valor y los valores del array
		
		// Del primer al ultimo indice
		System.out.println(); 	
		for(int i = 0 ; i != tamaño ; i++) {
			System.out.println("Nombre guardado en la posición" + "[" + i + "] es: " + array[i]); 	
		}
		
		// Del ultimo al primer indice
		System.out.println(); 	
		for(int i = tamaño-1 ; i != -1 ; i--) {
			System.out.println("Nombre guardado en la posición" + "[" + i + "] es: " + array[i]); 	
		}
	}

}

