package com.arquitecturajava.mocking2;

public class Caja {

	private Regalo regalo1;
	private Regalo regalo2;
	private Regalo regalo3;
	private double precio;

	public Regalo getRegalo1() {
		return regalo1;
	}

	public void setRegalo1(Regalo regalo1) {
		this.regalo1 = regalo1;
	}

	public Regalo getRegalo2() {
		return regalo2;
	}

	public void setRegalo2(Regalo regalo2) {
		this.regalo2 = regalo2;
	}

	public Regalo getRegalo3() {
		return regalo3;
	}

	public void setRegalo3(Regalo regalo3) {
		this.regalo3 = regalo3;
	}

	public Caja(Regalo regalo1, Regalo regalo2, Regalo regalo3) {
		super();
		this.regalo1 = regalo1;
		this.regalo2 = regalo2;
		this.regalo3 = regalo3;
	}

	
	
	
	public Caja(Regalo regalo1, Regalo regalo2, Regalo regalo3, double precio) {
		super();
		this.regalo1 = regalo1;
		this.regalo2 = regalo2;
		this.regalo3 = regalo3;
		this.precio = precio;
	}

	public double getPrecioTotal() {

		return precio +regalo1.getPrecio()+ regalo2.getPrecio() + regalo3.getPrecio();
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecioTotalConIva() {

		return (precio*1.21)+ regalo1.getPrecioConIVA() + regalo2.getPrecioConIVA() + regalo3.getPrecioConIVA();
	}

}
