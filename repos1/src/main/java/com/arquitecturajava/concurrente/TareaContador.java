package com.arquitecturajava.concurrente;

public class TareaContador implements Runnable {

	private Contador contador;

	public TareaContador(Contador contador) {
		super();
		this.contador = contador;
	}

	public Contador getContador() {
		return contador;
	}

	public void setContador(Contador contador) {
		this.contador = contador;
	}

	@Override
	public void run() {

		contador.incrementar(5);

	}

}
