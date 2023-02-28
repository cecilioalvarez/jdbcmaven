package com.arquitecturajava.concurrente;

import java.util.ArrayList;
import java.util.List;

public class Bolsa {

	private List<Producto> productos= new ArrayList<Producto>();
	private int tope=0;
	
	
	public int getTope() {
		return tope;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Bolsa(int tope,List<Producto> productos) {
		super();
		this.tope=tope;
		this.productos = productos;
	}
	
	public void addProducto(Producto p) {
		if (this.productos.size()<tope)
		this.productos.add(p);
	}
	
	public boolean estaLlena() {
		
		return tope==this.productos.size();
	}
	
}
