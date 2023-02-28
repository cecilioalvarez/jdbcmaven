package com.arquitecturajava.concurrente;

import java.util.ArrayList;

public class Principal4 {

	public static void main(String[] args) {

		Bolsa b = new Bolsa(5, new ArrayList<Producto>());
		Thread hilo = new Thread(new TareaEnvio(b));
		hilo.start();

		for (int i = 0; i < 10; i++) {

			Producto p = new Producto("p" + i, 200);
			synchronized (b) {
				
				if (!b.estaLlena())
					b.addProducto(p);
				else {
					System.out.println(" no se admite mas y esta llena");
					b.notifyAll();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(100);
					System.out.println(p.getNombre());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		}

		System.out.println("la bolsa esta llena");
		System.out.println(b.estaLlena());

	}

}
