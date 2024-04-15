package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;
    
    private final double ING_ESPECIALES_20 = 500.00;
    private final double ING_ESPECIALES_30 = 750.00;
    private final double ING_ESPECIALES_40 = 1000.00;
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}



	public void calcularPrecio() {
	    double precioBase = 0;
	    double precioEspecial = 0;

	    switch (this.diametro) {
	        case 20:
	            precioBase = 4500;
	            if (ingredientesEspeciales) {
	                precioEspecial = ING_ESPECIALES_20;
	            }
	            break;
	        case 30:
	            precioBase = 4800;
	            if (ingredientesEspeciales) {
	                precioEspecial = ING_ESPECIALES_30;
	            }
	            break;
	        case 40:
	            precioBase = 5500;
	            if (ingredientesEspeciales) {
	                precioEspecial = ING_ESPECIALES_40;
	            }
	            break;
	        default:            
	            break;
	    }
	    this.precio = precioBase + precioEspecial;
	}
	

	
	public void calcularArea() {
		area = Math.PI * Math.pow(this.diametro / 2, 2);
	}
	
}
