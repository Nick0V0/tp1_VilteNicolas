package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Persona {
	private String Dni;
	private String Nombre;
	private LocalDate FechaDeNacimiento;
	private String Provincia ;
	
	
    public Persona() {
	}
	
    
    
	public void setDni(String dni) {
		Dni = dni;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}



	public void setProvincia(String provincia) {
		Provincia = provincia;
	}



	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		this.Dni = dni;
		this.Nombre = nombre;
		this.FechaDeNacimiento = fechaDeNacimiento;
		this.Provincia = provincia;
	}
    
	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento) {
		this.Dni = dni;
		this.Nombre = nombre;
		this.FechaDeNacimiento = fechaDeNacimiento;
		this.Provincia = "Jujuy";
	}
	
	public int CalcularEdad() {
		return Period.between(this.FechaDeNacimiento, LocalDate.now()).getYears();
	}
	
	public boolean MayorDeEdad() {
		return (this.CalcularEdad() >= 18);	
	}
	
	public void MostrarDatos() {
		System.out.println("DNI: " + this.Dni);
		System.out.println("Nombre: " + this.Nombre);
		System.out.println("Fecha de nacimiento: " + this.FechaDeNacimiento);
		System.out.println("Provincia: " + this.Provincia);
		System.out.println("Edad: " + this.CalcularEdad());
		if (this.MayorDeEdad()) {
			System.out.println("La persona es mayor de edad" );
		}
		else {
			System.out.println("La persona no es mayor de edad");
		}
		
	}
	
	
}
