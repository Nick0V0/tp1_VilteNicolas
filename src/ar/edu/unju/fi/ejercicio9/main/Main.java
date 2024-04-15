package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos para el producto " + (i + 1) + ":");

            Producto producto = new Producto();

            System.out.print("Nombre: ");
            producto.setNombre(scanner.nextLine());

            System.out.print("Código: ");
            producto.setCodigo(scanner.nextLine());

            System.out.print("Precio: ");
            producto.setPrecio(scanner.nextDouble());

            System.out.print("Descuento (valor entero comprendido entre [0 - 50]): ");
            producto.setDescuento(scanner.nextInt());

            System.out.println("Los datos ingresados para el producto " + (i + 1) + " son:");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Descuento: " + producto.getDescuento());
            System.out.println("Precio con descuento: " + producto.calcularDescuento());
        }
    }
}