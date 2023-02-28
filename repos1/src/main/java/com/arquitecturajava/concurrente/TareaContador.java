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

	public void incrementar() {
		contador.incrementar();
	}

	@Override
	public void run() {
		

		for (int i=0;i<20;i++) {
			
			incrementar();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
