package com.arquitecturajava.concurrente;

public class TareaNueva implements Runnable {

	private String nombre;
	
	public TareaNueva(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println(" soy la tarea "+ nombre);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
