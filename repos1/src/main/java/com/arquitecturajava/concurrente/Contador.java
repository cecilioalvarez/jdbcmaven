package com.arquitecturajava.concurrente;

public class Contador {

	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// thread 1 a esta tarea y empiezo el bucle for
	// este metodo estara sincronizado y no nos permitira el acceso a otros
	public synchronized void incrementar(int veces) {

		for (int i = 0; i < veces; i++) {
			numero = numero + 1;
			System.out.println(numero);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public Contador(int numero) {
		super();
		this.numero = numero;
	}

}
