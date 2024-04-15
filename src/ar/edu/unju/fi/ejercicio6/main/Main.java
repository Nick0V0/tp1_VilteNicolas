package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String Dni;
		String Nombre;
		LocalDate FechaDeNacimiento;
		String Provincia ;
		
		//(constructor vacío)
		System.out.println("--------------------------------------------------------");
		System.out.println("Introduce");
		System.out.println("Dni: ");
		Dni = scanner.nextLine();
		System.out.println("Nombre: ");
		Nombre = scanner.nextLine();
		System.out.println("Fecha De Nacimiento (Formato: AAAA-MM-DD Ej: 2000-02-02): ");
		FechaDeNacimiento = LocalDate.parse(scanner.nextLine());
		System.out.println("Provincia: ");
		Provincia = scanner.nextLine();
		Persona Persona1 = new Persona();

		Persona1.setDni(Dni);
		Persona1.setFechaDeNacimiento(FechaDeNacimiento);
		Persona1.setNombre(Nombre);
		Persona1.setProvincia(Provincia);
	
		Persona1.MostrarDatos();
		
		//(constructor parametrizado)
		System.out.println("--------------------------------------------------------");
		System.out.println("Introduce");
		System.out.println("Dni: ");
		Dni = scanner.nextLine();
		System.out.println("Nombre: ");
		Nombre = scanner.nextLine();
		System.out.println("Fecha De Nacimiento (Formato: AAAA-MM-DD Ej: 2000-02-02): ");
		FechaDeNacimiento = LocalDate.parse(scanner.nextLine());
		System.out.println("Provincia: ");
		Provincia = scanner.nextLine();
		
		Persona Persona2 = new Persona(Dni, Nombre, FechaDeNacimiento, Provincia);
		
		Persona2.MostrarDatos();
		
		//(atributo provincia inicializarlo con valor “Jujuy”)
		System.out.println("--------------------------------------------------------");
		System.out.println("Introduce");
		System.out.println("Dni: ");
		Dni = scanner.nextLine();
		System.out.println("Nombre: ");
		Nombre = scanner.nextLine();
		System.out.println("Fecha De Nacimiento (Formato: AAAA-MM-DD Ej: 2000-02-02): ");
		FechaDeNacimiento = LocalDate.parse(scanner.nextLine());

		
		Persona Persona3 = new Persona(Dni, Nombre, FechaDeNacimiento);
		Persona3.MostrarDatos();
		
	}

}
