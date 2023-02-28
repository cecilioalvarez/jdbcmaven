package com.arquitecturajava.concurrente;

public class Tarea implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("hola soy una tarea :" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
