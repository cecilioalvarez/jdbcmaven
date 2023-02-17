package com.arquitecturajava;

public class Gasto {

	private String concepto;
	private double importe;
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public Gasto(String concepto, double importe) {
		super();
		this.concepto = concepto;
		this.importe = importe;
	}
	
	
}
