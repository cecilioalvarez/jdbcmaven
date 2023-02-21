package com.arquitecturajava;

public class NiñoDTO {

	private String nombre;
	private int edad;
	private String regalo;
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
	public String getRegalo() {
		return regalo;
	}
	public void setRegalo(String regalo) {
		this.regalo = regalo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public NiñoDTO(String nombre, int edad, String regalo, double precio) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.regalo = regalo;
		this.precio = precio;
	}
	public NiñoDTO() {
		super();
	}
	
	
}
