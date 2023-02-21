package com.arquitecturajava;

public class NiñoDTO {

	private String nombre;
	private int edad;
	private String nombreRegalo;
	private double precio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombreRegalo() {
		return nombreRegalo;
	}
	public void setNombreRegalo(String nombreRegalo) {
		this.nombreRegalo = nombreRegalo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public NiñoDTO(String nombre, int edad, String nombreRegalo, double precio) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nombreRegalo = nombreRegalo;
		this.precio = precio;
	}
	public NiñoDTO() {
		super();
	}
	
	
}
