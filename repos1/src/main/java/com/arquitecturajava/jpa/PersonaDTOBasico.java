package com.arquitecturajava.jpa;

public class PersonaDTOBasico {

	private String nombre;
	private int edad;
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
	public PersonaDTOBasico(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public PersonaDTOBasico(Persona p) {
		
		this.nombre=p.getNombre();
		this.edad=p.getEdad();
	}
	@Override
	public String toString() {
		return "PersonaDTOBasico [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
