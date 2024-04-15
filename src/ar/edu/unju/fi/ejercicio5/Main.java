package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Excriba un número entero dentro del rango [1,9]:");
		int num = scanner.nextInt();
		while(num>9 || num < 1){
			System.out.println("El número esta fuera de rango");
			System.out.println("Excriba un número entero dentro del rango [1,9]:");
			num = scanner.nextInt();
		}
		for(int i = 0;i < 11;i++){
			System.out.println(num + " x " + i + " = " + i*num);
		}
	}

}
