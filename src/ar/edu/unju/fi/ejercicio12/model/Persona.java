package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	private String Nombre;
	private Calendar Fecha;
	
	
	//Constructor por defect
	
	public Persona() {
	// TODO Auto-generated constructor stub
	}

	// Métodos accesores (getters y setters)
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String  getFecha() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(Fecha.getTime());
	}

	public void setFecha(Calendar fecha) {
		Fecha = fecha;
	}
	
	// Métodos para determinar la edad de la persona 

    public int CalcularEdad() {
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - this.Fecha.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR) < this.Fecha.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }
    
	// Métodos para determinar signo del zodiaco de la persona
	
    public String SignoZodiacal () {
        int Mes = this.Fecha.get(Calendar.MONTH);
        int Dia = this.Fecha.get(Calendar.DAY_OF_MONTH);
        switch (Mes){
            case 0: 
                if(Dia>=20) {
                    return "Acuario";
                }
                else {
                    return "Capricornio";
                }
            case 1: 
                if(Dia>=19) {
                    return "Picis";
                }
                else {
                    return "Acuario";
                }
            case 2: 
                if(Dia>=21) {
                    return "Aries";
                }
                else {
                    return "Picis";
                }
            case 3:
                if(Dia>=20) {
                    return "Tauro";
                }
                else {
                    return "Aries";
                }
            case 4: 
                if(Dia>=21) {
                    return "Géminis";
                }
                else {
                    return "Tauro";
                }
            case 5:
                if(Dia>=21) {
                    return "Cáncer";
                }
                else {
                    return "Géminis";
                }
            case 6: 
                if(Dia>=23) {
                    return "Leo";
                }
                else {
                    return "Cáncer";
                }
            case 7: 
                if(Dia>=23) {
                    return "Virgo";
                }
                else {
                    return "Leo";
                }
            case 8:
                if(Dia>=23) {
                    return "Libra";
                }
                else {
                    return "Virgo";
                }
            case 9: 
                if(Dia>=23) {
                    return "Escorpio";
                }
                else {
                    return "Libra";
                }
            case 10: 
                if(Dia>=22) {
                    return "Sagitario";
                }
                else {
                    return "Escorpio";
                }
            case 11:  
                if(Dia>=22) {
                    return "Capricornio";
                }
                else {
                    return "Sagitario";
                }
            default:
                return " ";
        }   
    }

	
	// Métodos para determinar estación del año según la fecha de nacimiento de la persona
	
    public String EstaciónDelAño() {
        int Mes = this.Fecha.get(Calendar.MONTH);
        int Dia = this.Fecha.get(Calendar.DAY_OF_MONTH);
        switch (Mes){
            case 0: 
                return "Verano";
            case 1: 
                return "Verano";
            case 2: 
                if(Dia>=20) {
                    return "Verano";
                }
                else {
                    return "Otoño";
                }
            case 3:
                return "Otoño";
            case 4: 
                return "Otoño";
            case 5:
                if(Dia>=21) {
                    return "Otoño";
                }
                else {
                    return "Invierno";
                }
            case 6: 
                return "Invierno";
            case 7: 
                return "Invierno";
            case 8:
                if(Dia>=21) {
                    return "Invierno";
                }
                else {
                    return "Primavera";
                }
            case 9: 
                return "Primavera";
            case 10: 
                return "Primavera";
            case 11:  
                if(Dia>=23) {
                    return "Primavera";
                }
                else {
                    return "Verano";
                }
            default:
                return " ";
        }   
    }

	
}

