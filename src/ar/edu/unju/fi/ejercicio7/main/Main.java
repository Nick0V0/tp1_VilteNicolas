package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    String nombre;
	    String legajo;
	    double salario;
	    System.out.println("Ingrese los datos para un nuevo empleado");
	    System.out.println("Nombre:");
	    nombre = scanner.nextLine();
	    System.out.println("Legajo:");
	    legajo = scanner.nextLine();
	    System.out.println("Salario:");
	    salario = scanner.nextDouble();
	    
	    Empleado Empleado1 = new Empleado(nombre,legajo,salario);
	    
	    Empleado1.MostrarDatos();
	    
	    System.out.println("----------------------------------------");
	    Empleado1.Aumento();
	    
	    Empleado1.MostrarDatos();
	    
	}

}
