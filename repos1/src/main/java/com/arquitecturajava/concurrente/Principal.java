package com.arquitecturajava.concurrente;

public class Principal {

	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName());
		
		Thread hilo = new Thread( new Tarea());
		hilo.start();
		System.out.println("termino");

	}

}
