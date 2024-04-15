package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
    private String codigo;
    private double precio;
    private int descuento;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public Producto(String nombre, String codigo, double precio, int descuento) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.descuento = descuento;
	}

	
}
