package com.arquitecturajava.mocking;

import java.time.LocalDate;

public class Examen {

	private LocalDate fecha;
	private Nota nota;

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

	public Examen(LocalDate fecha, Nota nota) {
		super();
		this.fecha = fecha;
		this.nota = nota;
	}

	public boolean estaAprobado() {
		return nota.estaAprobada();
	}

	public int esMayor(Examen o) {
		return nota.esMayor(o.getNota());
	}

	public boolean esBuenaNota() {

		if (nota.esNotable() || nota.esSobreSaliente()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esMalaNota() {

		if (nota.esSuspenso() || nota.esMuyDeficiente()) {
			return true;
		} else {
			return false;
		}
	}

}
