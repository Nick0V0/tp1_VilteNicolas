package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
    private String Nombre;
    private String Legajo;
    private double Salario;
    private final double SalarioMin = 210000.00;
    private final double Meritos = 20000.00;
    
	public Empleado(String nombre, String legajo, double salario) {
		this.Nombre = nombre;
		this.Legajo = legajo;
		if (salario >= this.SalarioMin ) {
			this.Salario = salario;
		}
		else {
			this.Salario = this.SalarioMin;
		}
	}
	
	public void MostrarDatos() {
		System.out.println("Nombre del empleado: " + this.Nombre);
		System.out.println("Legajo: " + this.Legajo);
		System.out.println("Salario $: " + this.Salario);
	}
	
	public void Aumento() {
		System.out.println("Aumento por méritos: " + this.Meritos);
		this.Salario += this.Meritos;
	}
    
	
    
}
