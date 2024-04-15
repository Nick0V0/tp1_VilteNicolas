package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el valor numérico entero de n:");
		int num = scanner.nextInt();
		CalculadoraEspecial Calculadora = new CalculadoraEspecial();
		Calculadora.setN(num);
        System.out.println("La sumatoria es: " + Calculadora.calcularSumatoria());
        System.out.println("La productoria es: " + Calculadora.CalcularProductoria());
	}

}
