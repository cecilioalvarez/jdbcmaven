package com.arquitecturajava.concurrente;

public class Contador {

	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void incrementar() {
		
		numero=numero+1;
	}

	public Contador(int numero) {
		super();
		this.numero = numero;
	}
	
	
}
