package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {

		List<Jugador> jugadores = new ArrayList<Jugador>();
		Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n\t\tMENÚ DE JUGADORES");
            System.out.println("------------------------");
            System.out.println("1. Alta de jugador");
            System.out.println("2. Mostrar datos de un jugador");
            System.out.println("3. Mostrar jugadores ordenados por apellido");
            System.out.println("4. Modificar datos de un jugador");
            System.out.println("5. Eliminar un jugador");
            System.out.println("6. Mostrar cantidad total de jugadores");
            System.out.println("7. Mostrar cantidad jugadores por nacionalidad");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:
                    	altaJugador(entrada, jugadores);
                        break;
                    case 2:
                    	if (jugadores.isEmpty()) {
                    	    System.out.println("La lista de jugadores está vacía.");
                    	} else {
                    		mostrarDatosJugador(entrada,jugadores);
                    	}
                        break;
                    case 3:
                    	if (jugadores.isEmpty()) {
                    	    System.out.println("La lista de jugadores está vacía.");
                    	} else {
                    		mostrarJugadoresOrdenadosApellido(jugadores);
                    	}
                        break;
                    case 4:
                    	if (jugadores.isEmpty()) {
                    	    System.out.println("La lista de jugadores está vacía.");
                    	} else {
                    		 modificarDatosJugador(entrada,jugadores);
                    	}
                        break;
                    case 5:
                    	if (jugadores.isEmpty()) {
                    	    System.out.println("La lista de jugadores está vacía.");
                    	} else {
                    		eliminarJugador(entrada,jugadores);
                    	}
                        break;
                    case 6:
                    	mostrarCantidadTotalJugadores(jugadores);
                        break;
                    case 7:
                    	mostrarJugadoresPorNacionalidad(entrada,jugadores);
                        break;
                    case 8:
                        System.out.println("Saliendo del menú...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                entrada.nextLine();
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado. Motivo: " + e.getMessage());
            }
        } while (opcion != 8);

        entrada.close();
	}
	

	static void altaJugador(Scanner entrada, List<Jugador> jugadores) {
        try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = entrada.nextLine();

            System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
            LocalDate fechaNacimiento = LocalDate.parse(entrada.nextLine());

            System.out.print("Ingrese la nacionalidad del jugador: ");
            String nacionalidad = entrada.nextLine();

            System.out.print("Ingrese la estatura del jugador (en cm): ");
            double estatura = entrada.nextDouble();
            entrada.nextLine();

            System.out.print("Ingrese el peso del jugador (en kg): ");
            double peso = entrada.nextDouble();
            entrada.nextLine();

            System.out.print("Ingrese la posición del jugador (delantero, medio, defensa, arquero): ");
            String posicion = entrada.nextLine();

            Jugador jugador = new Jugador(nombre, apellido, fechaNacimiento, nacionalidad, estatura, peso, posicion);
            jugadores.add(jugador);
            System.out.println("Hay " + jugadores.size()+" Jugador dado de alta correctamente.");
            
        } catch (Exception e) {
            System.out.println("Error al dar de alta al jugador. Motivo: " + e.getMessage());
        }
    }

	static void mostrarDatosJugador(Scanner entrada, List<Jugador> jugadores) {
        System.out.println("aquiiiii "+jugadores.size());
		try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = entrada.nextLine();

            Jugador jugador = buscarJugador(nombre, apellido, jugadores);
            if (jugador != null) {
                System.out.println("\nDatos del jugador:");
                System.out.println("Nombre: " + jugador.getNombre() + " " + jugador.getApellido());
                System.out.println("Fecha de nacimiento: " + jugador.getFechaNac());
                System.out.println("Nacionalidad: " + jugador.getNacionalidad());
                System.out.println("Estatura: " + jugador.getEstatura() + " cm");
                System.out.println("Peso: " + jugador.getPeso() + " kg");
                System.out.println("Posición: " + jugador.getPosicion());
                System.out.println("Edad: " + jugador.calcularEdad() + " años");
            } else {
                System.out.println("Jugador no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar datos del jugador. Motivo: " + e.getMessage());
        }
    }

    static void mostrarJugadoresOrdenadosApellido(List<Jugador> jugadores) {
        
    	try {
            Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));
                       
            System.out.println("\nJugadores ordenados por apellido:");
            for (Jugador jugador : jugadores) {
                System.out.println(jugador);
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar jugadores ordenados. Motivo: " + e.getMessage());
        }
    }
    
    static Jugador buscarJugador(String nombre, String apellido, List<Jugador> jugadores) {
    	
    	Jugador jugadorEncontrado = new Jugador();
    	jugadorEncontrado = null;
    	try {        	
            for (Jugador jugador : jugadores) {
            	if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
            		jugadorEncontrado = jugador;
            	}                
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar jugadores ordenados. Motivo: " + e.getMessage());
        }
        return jugadorEncontrado;
    }

    static void modificarDatosJugador(Scanner entrada ,List<Jugador> jugadores) {
		try {
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = entrada.nextLine();

            System.out.print("Ingrese el apellido del jugador: ");
            String apellido = entrada.nextLine();


            Jugador jugador = buscarJugador(nombre, apellido, jugadores);
            
            if (jugador != null) {
            	
            	System.out.println("Modificar los datos de un jugado");
                System.out.print("Ingrese el nombre del jugador: ");
                jugador.setNombre(entrada.nextLine());

                System.out.print("Ingrese el apellido del jugador: ");
                jugador.setApellido(entrada.nextLine());

                System.out.print("Ingrese la fecha de nacimiento (YYYY-MM-DD): ");
                jugador.setFechaNac(LocalDate.parse(entrada.nextLine()));

                System.out.print("Ingrese la nacionalidad del jugador: ");
                jugador.setNacionalidad(entrada.nextLine());

                System.out.print("Ingrese la estatura del jugador (en cm): ");
                jugador.setEstatura(entrada.nextDouble()); 
                entrada.nextLine();

                System.out.print("Ingrese el peso del jugador (en kg): ");
                jugador.setPeso(entrada.nextDouble()); 
                entrada.nextLine();

                System.out.print("Ingrese la posición del jugador (delantero, medio, defensa, arquero): ");
                jugador.setPosicion(entrada.nextLine());
                
            	
            } else {
                System.out.println("Jugador no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al mostrar datos del jugador. Motivo: " + e.getMessage());
        }
    	
    	
    }

    static void eliminarJugador(Scanner entrada ,List<Jugador> jugadores) {
		try {
	        System.out.print("Ingrese el nombre del jugador: ");
	        String nombre = entrada.nextLine();
	
	        System.out.print("Ingrese el apellido del jugador: ");
	        String apellido = entrada.nextLine();
	        boolean eliminado = false;
	        
			for(int i=0; i< jugadores.size();i++) {
				if(nombre.equals(jugadores.get(i).getNombre()) && apellido.equals(jugadores.get(i).getApellido()) ) {
					eliminado = true;
					jugadores.remove(i);
				}
			}
	        if (eliminado) {
	        	System.out.println("Jugador a sido eliminado con exito.");
	        } else {
	            System.out.println("Jugador no encontrado.");
	        }
	
	    } catch (Exception e) {
	        System.out.println("Error al ingrsar datos del jugador. Motivo: " + e.getMessage());
	    }	
    }
	
    static void mostrarCantidadTotalJugadores(List<Jugador> jugadores){
		System.out.println("Cantidad de jugadore : " +jugadores.size());
		}
    
    static void mostrarJugadoresPorNacionalidad(Scanner entrada ,List<Jugador> jugadores){
    	try {
	        System.out.print("Ingrese la nacionalidad: ");
	        String nacionalidad = entrada.nextLine();
	
	        int cont = 0;
	        
			for(int i=0; i< jugadores.size();i++) {
				if(nacionalidad.equals(jugadores.get(i).getNacionalidad())) {
					cont++;
				}
			}
	        if (cont == 0) {
	        	System.out.println("Jugador no encontrado.");
	        } else {
	            System.out.println("Se a encontrado " + cont + " jugador/es con Nacionalidad " + nacionalidad);
	        }
	
	    } catch (Exception e) {
	        System.out.println("Error al ingrsar datos del jugador. Motivo: " + e.getMessage());
	    }	
    	
    }
    
}
