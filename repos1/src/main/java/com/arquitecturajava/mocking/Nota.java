package com.arquitecturajava.mocking;

public class Nota {

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

	public int esMayor(Nota o) {

		if (this.getValor() > o.getValor()) {
			return 1;
		} else if (this.getValor() == o.getValor()) {
			return 0;
		} else
			return -1;
	}

	public boolean esSobreSaliente() {

		return valor > 2;
	}

	public boolean esNotable() {

		return valor > 7 && valor<=9;
	}
	public boolean esBien() {

		return valor > 6 && valor<=7;
	}
	public boolean esSuficiente() {

		return valor >=5 && valor<=6;
	}
	public boolean esSuspenso() {

		return valor >=3 && valor<5;
	}
	
	public boolean esMuyDeficiente() {

		return valor<3;
	}
}
