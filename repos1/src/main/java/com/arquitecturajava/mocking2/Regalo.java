package com.arquitecturajava.mocking2;

public class Regalo {

	private double precio;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Regalo(double precio) {
		super();
		this.precio = precio;
	}
	
	public double getPrecioConIVA() {
		
		return precio*1.21;
	}
	
	
}
