package com.arquitecturajava.concurrente;

public class Principal {

	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName());
		
		Thread hilo = new Thread( new Tarea());
		hilo.start();
		
		Thread hilo2 = new Thread( new Tarea());
		hilo2.start();
		
		Thread hilo3 = new Thread( new Tarea());
		hilo3.start();
		
		System.out.println("termino");

	}

}
