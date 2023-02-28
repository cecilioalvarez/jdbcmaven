package com.arquitecturajava.concurrente;

public class Principal2 {

	public static void main(String[] args) {
	
		
		// este es hilo principal
		Thread hilo = new Thread( new TareaNueva("tareaA"));
		hilo.start();
		Thread hilo2 = new Thread( new TareaNueva("tareaB"));
		hilo2.start();
		
		try {
			hilo.join();
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("termino");
		
		

	}

}
