package com.arquitecturajava.complementario;

import java.util.Calendar;
import java.util.Date;

public class Fechas {

	public static void main(String[] args) {

		Calendar calendario = Calendar.getInstance();
		calendario.set(2023, 2, 22);
		Date fecha = calendario.getTime();

		int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
		int mes = calendario.get(Calendar.MONTH);
		int diadelmes = calendario.get(Calendar.DAY_OF_MONTH);
		int diadelaño = calendario.get(Calendar.DAY_OF_YEAR);

		int año = calendario.get(Calendar.YEAR);
		System.out.println(diaSemana);
		System.out.println(mes);
		System.out.println(año);
		System.out.println(diadelmes);
		System.out.println(diadelaño);

		calendario.set(2023, 5, 22);
		Date fecha1= calendario.getTime();
	
		diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
		mes = calendario.get(Calendar.MONTH);
		diadelmes = calendario.get(Calendar.DAY_OF_MONTH);
		diadelaño = calendario.get(Calendar.DAY_OF_YEAR);

		año = calendario.get(Calendar.YEAR);
		System.out.println(diaSemana);
		System.out.println(mes);
		System.out.println(año);
		System.out.println(diadelmes);
		System.out.println(diadelaño);

		
		System.out.println(fecha.after(fecha1));
		System.out.println(fecha.before(fecha1));
	}

}
