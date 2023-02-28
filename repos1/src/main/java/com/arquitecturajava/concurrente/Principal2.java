package com.arquitecturajava.concurrente;

public class Principal2 {

	public static void main(String[] args) {
	
		
		
		Thread hilo = new Thread( new TareaNueva("tareaA"));
		hilo.start();
		
	
		
		

	}

}
