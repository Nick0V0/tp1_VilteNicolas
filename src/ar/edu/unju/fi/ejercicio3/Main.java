package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entero");
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println("El número es par.\nEl triple del número es: "  + (num * 3));
		}
		else {
			System.out.println("El número es impar.\nEl doble del número es: "  + (num * 2));
		}
	}
}
