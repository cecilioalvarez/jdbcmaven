package com.arquitecturajava.concurrente;

public class Principal3 {

	public static void main(String[] args) {

		Contador c = new Contador(0);
		// este es hilo principal
		Thread hilo = new Thread(new TareaContador(c));
		hilo.start();
		
		Thread hilo2 = new Thread(new TareaContador(c));
		hilo2.start();

		

	}

}
