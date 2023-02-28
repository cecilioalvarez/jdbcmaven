package com.arquitecturajava.concurrente;

public class Principal3 {

	public static void main(String[] args) {
	
		Contador c= new Contador(0);
		// este es hilo principal
		Thread hilo = new Thread( new TareaContador(c));
		hilo.start();
	
		for (int i=0;i<20;i++) {
			
			try {
				System.out.println(c.getNumero());
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
