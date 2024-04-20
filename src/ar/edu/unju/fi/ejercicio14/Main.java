package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Creacion de array
		int tamaño = 0;
		do {
			System.out.print("ingrese por consola un número entero, que se encuentre en el rango [3,10]:");
			while(!scanner.hasNextInt()) {
				System.out.println("No es un numero entero" );
				System.out.print("ingrese por consola un número entero, que se encuentre en el rango [3,10]:");
				scanner.next();
			}
			tamaño = scanner.nextInt();
			scanner.nextLine();
		}while(!((tamaño >= 3) && (tamaño <= 10)));
		int[] array = new int[tamaño];
		
		// Solicitar números enteros 
		for(int i = 0 ; i!=tamaño ; i++) {
			System.out.print("ingrese un numero entero para ARRAY" + "[" + i +"]: ");
			while(!scanner.hasNextInt()) {
				System.out.println("No es un numero entero" );
				System.out.print("ingrese un numero entero para ARRAY" + "[" + i +"]: ");
				scanner.next();
			}
			array[i] = scanner.nextInt();
			scanner.nextLine();
		}
		
		// Mostrar el índice,el valor y la suma de todos los valores del array
		int suma = 0;
		for(int i = 0 ; i != tamaño ; i++) {
			System.out.println("ARRAY" + "[" + i + "]: " + array[i]); 	
			suma += array[i];
		}
		System.out.println("La suma de todos los valores es: " + suma);
	}

}
