package com.arquitecturajava;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {

	private int id;
	private String nombre;
	private List<Gasto> gastos= new ArrayList<Gasto>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Cliente(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public boolean add(Gasto e) {
		return gastos.add(e);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return id == other.id;
	}
	public Cliente() {
		super();
	}
	
	
	
	
}
