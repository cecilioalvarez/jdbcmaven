package com.arquitecturajava.mocking;

public class Nota implements Comparable<Nota> {

	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Nota(double valor) {
		super();
		this.valor = valor;
	}

	public boolean estaAprobada() {

		return valor >= 5;
	}

	@Override
	public int compareTo(Nota o) {

		if (this.getValor() > o.getValor()) {
			return 1;
		} else if (this.getValor() == o.getValor()) {
			return 0;
		} else
			return -1;
	}

}
