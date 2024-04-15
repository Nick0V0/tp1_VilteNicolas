package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial{
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public CalculadoraEspecial(int n) {
		this.n = n;
	}
	
	
	public int  calcularSumatoria() {
		int resultado=0; 
		for(int k=1 ; k <= this.n ; k++) {
			resultado += Math.pow((k * (k + 1))/2, 2);
		}
		return resultado;
	}
	
	public int CalcularProductoria() {
		int resultado=1; 
		for(int k=1 ; k <= this.n ; k++) {
			resultado *= k * (k + 4);
		}
		return resultado;
	}
}
	
