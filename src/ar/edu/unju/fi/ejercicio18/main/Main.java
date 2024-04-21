package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	public static void main(String[] args) {
		List <DestinoTuristico> listadoDestinos = new ArrayList<DestinoTuristico>();
		//listadoDestinos.add		
		listadoDestinos.forEach(dT -> System.out.println(dT));
		Pais Argentina = new Pais();
		Argentina.setCodigo("A1");
		Argentina.setNombre("Argentina");
		Pais Brasil = new Pais();
		Brasil.setCodigo("B1");
		Brasil.setNombre("Brasil");
		listadoDestinos.add(new DestinoTuristico(1,"Jujuy",23,Argentina,3));
		listadoDestinos.add(new DestinoTuristico(2,"Salta",23,Argentina,3));
		listadoDestinos.add(new DestinoTuristico(3,"Recife",23,Brasil,3));
		Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n\t\t DESTINO TURISTICO");
            System.out.println("------------------------");
            System.out.println("1. Alta de destino turístico ");
            System.out.println("2. Mostrar todos los destinos turísticos");
            System.out.println("3. Modificar el país de un destino turístico");
            System.out.println("4. Limpiar el ArrayList de destino turístico");
            System.out.println("5. Eliminar un destino turístico");
            System.out.println("6. Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7. Mostrar todos los países");
            System.out.println("8. Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1:
                    	AltaDestino(entrada, listadoDestinos);
                        break;
                    case 2:
                    	if (listadoDestinos.isEmpty()) {
                    	    System.out.println("La lista de destino turístico está vacía.");
                    	} else {
                    		MostrarDatosDestino(entrada,listadoDestinos);
                    	}
                        break;
                    case 3:
                    	if (listadoDestinos.isEmpty()) {
                    		System.out.println("La lista de destino turístico está vacía.");
                    	} else {
                    		ModificarDatosDestino(entrada,listadoDestinos);
                    	}
                        break;
                    case 4:
                    	limpiarArrayList(listadoDestinos);
                        break;
                    case 5:
                    	if (listadoDestinos.isEmpty()) {
                    	    System.out.println("La lista de destino turístico está vacía.");
                    	} else {
                    		EliminarDestinoTurístico(entrada,listadoDestinos);
                    	}
                        break;
                    case 6:
                    	if (listadoDestinos.isEmpty()) {
                    	    System.out.println("La lista de destino turístico está vacía.");
                    	} else {
                    		MostrarPorOrden(listadoDestinos);
                    	}
                        break;
                    case 7:
                    	if (listadoDestinos.isEmpty()) {
                    	    System.out.println("La lista de destino turístico está vacía.");
                    	} else {
                    		MostrarPais(entrada,listadoDestinos);
                    	}	
                        break;
                    case 8:
                    	if (listadoDestinos.isEmpty()) {
                    	    System.out.println("La lista de destino turístico está vacía.");
                    	} else {
                    		MostrarPorCodigoDePais(entrada,listadoDestinos);
                    	}
                    	
                        break;
                    case 9:
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
            
        } while(opcion != 9);

        entrada.close();
	}     
        
	static int codigo(Scanner entrada) {
		int codigo = 0;
		try {
	        System.out.print("Ingrese el código del destino turístico: ");
	        codigo = entrada.nextInt();			        
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("Error porque ingreso datos no valido . Motivo: " + e.getMessage());
		}
        return codigo;
        
	}
	
	static String nombre(Scanner entrada) {
        System.out.print("Ingrese el nombre del destino turístico: ");
        return entrada.nextLine();
        
	}
	
	static double precio(Scanner entrada) {
		double precio = 0;
		try {
	        System.out.print("Ingrese el precio del destino turístico: ");
	        precio = entrada.nextDouble();
	        entrada.nextLine();
	        
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("Error porque ingreso datos no valido . Motivo: " + e.getMessage());
		}
		return precio;
	}
	
	static Pais pais(Scanner entrada) {
		boolean band=false;
		String cod,nom="";
		do {
	        System.out.println("Ingrese el código del pais: ");
			System.out.println(" A1 - Argentina");
			System.out.println(" B2 - Brasil");
			 cod = entrada.next();
			 entrada.nextLine();
			if(cod.equals("A1")) {
				nom= "Argentina ";
			}
			if(cod.equals("B2")) {
				nom = "Brasil ";
			}
			if(cod.equals("A1") == true || cod.equals("B2") == true) {
				band=true;
			}
			else {
				System.out.println("Opcion incorrecta");
			}
		}while(!band);
		
		return new Pais(cod,nom);
	}
	
	static int dias(Scanner entrada) {
		int d=0;
		try {
			System.out.print("Ingrese la cantidad de días del destino turístico: ");
			d = entrada.nextInt();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("Error porque ingreso datos no valido . Motivo: " + e.getMessage());
		}
		entrada.nextLine();
		return d;
	}
	
	static void AltaDestino(Scanner entrada,List <DestinoTuristico>listadoDestinos) {
		DestinoTuristico e = new DestinoTuristico(codigo(entrada),nombre(entrada),precio(entrada),pais(entrada),dias(entrada));
		listadoDestinos.add(e);

	}
        
    static void MostrarDatosDestino(Scanner entrada, List<DestinoTuristico> destinos) {
				System.out.println(destinos.toString());
	}
	
    static DestinoTuristico BuscarDestinoTuristico(Scanner entrada, int codigo, List<DestinoTuristico> destinos) {   	
    	DestinoTuristico DestinoEncontrado = new DestinoTuristico();
    	DestinoEncontrado = null;
            for (DestinoTuristico destin : destinos) {
            	if (destin.getCodigo() == codigo) {
            		DestinoEncontrado = destin;
            	}                
            }
        return DestinoEncontrado;
    }
	
	static void ModificarDatosDestino(Scanner entrada, List<DestinoTuristico> destinos) {
		try {
			System.out.println("Ingrese codigo de destino turistico:");
			int codigo = entrada.nextInt();
			entrada.nextLine();
			DestinoTuristico desti = BuscarDestinoTuristico(entrada,codigo,destinos);
			desti.setPais(pais(entrada));
		} catch (Exception e) {
            System.out.println("Error al mostrar datos del Destino turístico. Motivo: " + e.getMessage());
        }
	}
		
	static void limpiarArrayList(List<DestinoTuristico> destinos) {
		destinos.clear();
		System.out.println("La lista de destino turístico está vacía.");
	}
	
	static void EliminarDestinoTurístico(Scanner entrada, List<DestinoTuristico> destinos) {
		try {
			System.out.println("Ingrese codigo de destino turistico:");
			int codigo = entrada.nextInt();
			entrada.nextLine();
	        boolean eliminado = false;
			
			for(int i=0; i< destinos.size();i++) {
				if(codigo == (destinos.get(i).getCodigo()) ) {
					eliminado = true;
					destinos.remove(i);
				}
			}
	        if (eliminado) {
	        	System.out.println("Destino turistico a sido eliminado con exito.");
	        } else {
	            System.out.println("Destino turistico no encontrado.");
	        }
	
	    } catch (Exception e) {
	        System.out.println("Error al ingrsar datos del destino turistico. Motivo: " + e.getMessage());
	    }	
    }
	
	static void MostrarPorOrden(List<DestinoTuristico> destinos) {
		Collections.sort(destinos,Comparator.comparing(DestinoTuristico::getNombre));
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println("Destino Turistico : "+destinoTuristico.getNombre());
		}
	}
	
	static void MostrarPais(Scanner entrada, List<DestinoTuristico> destinos) {
		int cont = 0; 
		Pais pais = new Pais();
		for(int i=0; i< destinos.size();i++) {
			 System.out.println("Pais : " + destinos.get(i).getPais().getNombre() + " Codigo del pais: " + destinos.get(i).getPais().getCodigo() + " Codigo del destino: " + destinos.get(i).getCodigo());
			}
	}
	
	static void MostrarPorCodigoDePais (Scanner entrada, List<DestinoTuristico> destinos) {
            System.out.print("Ingrese codigo del pais:");
            String codigo = entrada.nextLine();	
            int cont = 0;
    		for(int i=0; i!= destinos.size();i++) {
   			    if(destinos.get(i).getPais().getCodigo().equals(codigo)) {
   			    	System.out.println("Pais : " + destinos.get(i).getPais().getNombre() + " ,Codigo del pais: " + destinos.get(i).getPais().getCodigo() + " ,Destino turistico: " + destinos.get(i).getNombre());
   			    	cont ++;
   			    }
    		}
            if (cont == 0) {
                System.out.println("Destino turistico no encontrado.");
            }
       
	}
}
	