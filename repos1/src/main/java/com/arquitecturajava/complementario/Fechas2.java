package com.arquitecturajava.complementario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fechas2 {

	public static void main(String[] args) {

		Calendar calendario = Calendar.getInstance();
		calendario.set(2023, 2, 22,2,20);

		
		DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy - HH:mm");

		System.out.println(formateador.format(calendario.getTime()));

		DateFormat formateador2 = new SimpleDateFormat("dd/MMMM/yy");

		System.out.println(formateador2.format(calendario.getTime()));

	}

}
