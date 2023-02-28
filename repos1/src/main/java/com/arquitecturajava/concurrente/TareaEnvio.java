package com.arquitecturajava.concurrente;

public class TareaEnvio implements Runnable {

	private Bolsa bolsa;

	public TareaEnvio(Bolsa bolsa) {
		super();
		this.bolsa = bolsa;
	}

	@Override
	public void run() {

		try {
			synchronized (bolsa) {
				if (!bolsa.estaLlena()) {
					
					System.out.println("pongo a esperar el envio ");
					bolsa.wait();
					
				}
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;

		System.out.println("enviando la bolsa");

	}

}
