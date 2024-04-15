package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 for (int i = 1; i <= 3; i++) {
			System.out.println("Ingrese los datos para la pizza " + i + ":");

            Pizza pizza = new Pizza();

            System.out.print("Diámetro (20, 30, 40): ");
            pizza.setDiametro(scanner.nextInt());

            System.out.print("¿Tiene ingredientes especiales? (true/false): ");
            pizza.setIngredientesEspeciales(scanner.nextBoolean());

            pizza.calcularPrecio();
            pizza.calcularArea();

            System.out.println("** Pizza " + i + " **");
            System.out.println("Diámetro = " + pizza.getDiametro());
            System.out.println("Ingredientes especiales = " + pizza.isIngredientesEspeciales());
            System.out.println("Precio Pizza = " + pizza.getPrecio());
            System.out.println("Área de la pizza = " + pizza.getArea());
            System.out.println("-------------------------------------------------");
        }
	}

}
