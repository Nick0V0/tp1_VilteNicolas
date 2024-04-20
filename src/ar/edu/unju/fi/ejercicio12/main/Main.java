package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona persona = new Persona();
		int dia,mes,anio;
		
		// Solicitar nombre de la persona
		System.out.print("Ingrese nombre: ");
		persona.setNombre(scanner.next());
		scanner.nextLine();
		
		// Solicitar y comprueba DIA de nacimiento de la persona
		System.out.print("Ingrese DIA de nacimiento: ");
		while(!scanner.hasNextInt()) {
			System.out.println("Eso no es un número. Inténtalo de nuevo.");
			System.out.print("Ingrese DIA de nacimiento: ");
			scanner.next();
		}
		dia = scanner.nextInt();
		scanner.nextLine();
		
		// Solicitar y comprueba MES de nacimiento de la persona
		System.out.print("Ingrese MES de nacimiento: ");
		while(!scanner.hasNextInt()) {
			System.out.println("Eso no es un número. Inténtalo de nuevo.");
			System.out.print("Ingrese MES de nacimiento: ");
			scanner.next();
		}
		mes = scanner.nextInt();
		scanner.nextLine();
		
		// Solicitar y comprueba AÑO de nacimiento de la persona
		System.out.print("Ingrese AÑO de nacimiento: ");
		while(!scanner.hasNextInt()) {
			System.out.println("Eso no es un número. Inténtalo de nuevo.");
			System.out.print("Ingrese AÑO de nacimiento: ");
			scanner.next();
		}
		anio = scanner.nextInt();
		
		Calendar FechaDeNacimiento = Calendar.getInstance();
		FechaDeNacimiento.set(Calendar.YEAR, anio);
		FechaDeNacimiento.set(Calendar.MONTH, mes-1);
		FechaDeNacimiento.set(Calendar.DAY_OF_MONTH, dia);
		persona.setFecha(FechaDeNacimiento);
		
		// Mostrar los datos de la persona y el resultado de cada método
		
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFecha());
        System.out.println("Edad: " + persona.CalcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.SignoZodiacal());
        System.out.println("Estación: " + persona.EstaciónDelAño());
	}

}
