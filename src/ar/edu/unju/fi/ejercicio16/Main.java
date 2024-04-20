package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			// Creacion de array
			String[] array = new String[5];
			
			// Solicitar 5 nombres de personas 
			for(int i=0;i!=5;i++) {
				System.out.print("Ingrese nombre Posicion " + i + ": ");
					array[i] = scanner.next();
					scanner.nextLine();
			}
			
			// Mostrar los valores del array
			System.out.println();
			int e=0;
			while( e != 5) {
				System.out.println("Nombre Posicion " + e + ": " + array[e]);
				e++;
				
			}
			// Mostrar tamaño de array
			System.out.println();
			System.out.println("Tamaño del array : " + array.length);
			
			// Menu
			String op;
			do {
				byte posicion ;
				System.out.println();
				System.out.println("Desea eliminar un nombre del array  1- SI / 2 -NO ??");
				System.out.print("Opcion: ");
				op = scanner.next();
				scanner.nextLine();
				
				switch (op) {
				
				// Elimina y muestra una posicio del array siempre y cuando esta no este vacia 
					case "1":
						System.out.print("	Ingrese Posicion del nombre a eliminar: ");
						byte pos = scanner.nextByte();
						scanner.nextLine();
						String aux = quitarNombre(array,pos);
						if(aux.equals("")) {
							System.out.println("	ESA POSICIO DEL ARRAY ESTA VACIA !");
						}
						else {
							System.out.println("	El nombre (" + aux + ") fue elimnado con exito");
						}
						break;
				// Muestra un mensaje antes para antes de finalizar el programa
					case "2":
						System.out.println("Fin del programa !");
						break;
				// Remarca que la opcion no es correcta
					default:
						System.out.println("Opcion incorrecta");
						break;
				}
				 
				// Muestra los valores del array por ultima vez 
				System.out.println();
				System.out.println("---------------------------------------------------------------");
				System.out.println("ARRAY ACTUAL:");
				for(int i=0;i!=5;i++){
					System.out.println("Nombre numero " + i + ": " + array[i]);
				}
				System.out.println("---------------------------------------------------------------");
			}while(!op.equals("2"));
	}			
				
		
	// Metodo para quitar nombre 
	static String quitarNombre(String[] nombres, byte pos) {
		String aux = "";
			if(pos <= nombres.length-1){
				aux = nombres[pos]; 
				for(int i = pos; i < nombres.length-1 ; i++) {
					nombres[i] = nombres[i+1];
				}
				nombres[nombres.length-1] = "";
			}
		return aux;
	}
}
