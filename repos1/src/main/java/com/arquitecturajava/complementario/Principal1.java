package com.arquitecturajava.complementario;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Principal1 {

	public static void main(String[] args) {
		
		
		Calendar calendario= Calendar.getInstance();
		
		calendario.set(2000,10,10);
		Date fecha1= calendario.getTime();
		calendario.set(1990,10,10);
		Date fecha2= calendario.getTime();
		calendario.set(1980,10,10);
		Date fecha3= calendario.getTime();
		
		List<Persona> lista= List.of (new Persona("pepe",fecha1)
				,new Persona("juan",fecha2),new Persona("ana",fecha3) );

		
		Persona mayor=lista.get(0);
		
		
		for (Persona p: lista) {
			
			if(!mayor.esMayor(p)) {
				mayor=p;
			}
		}
		System.out.println(mayor.getNombre());
	}

}
