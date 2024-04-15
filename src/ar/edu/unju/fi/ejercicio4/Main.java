package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Excriba un número entero dentro del rango [0,10]:");
		int num = scanner.nextInt();
		while(num>10 || num < 0){
			System.out.println("El número esta fuera de rango");
			System.out.println("Excriba un número entero dentro del rango [0,10]:");
			num = scanner.nextInt();
		}
		int cont=num;
		int resul=1;
		while(cont != 0){
			resul=resul*cont;
			cont--;
		}
		System.out.println("El factorial de un número entero (" + num + ") es " + resul);
	}

}
