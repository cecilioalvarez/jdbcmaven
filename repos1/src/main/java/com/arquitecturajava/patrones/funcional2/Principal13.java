package com.arquitecturajava.patrones.funcional2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Principal13 {

	public static void main(String[] args) {

		Persona p1 = new Persona("pedro", "gomez", 20);
		Persona p2 = new Persona("angel", "alvarez", 10);
		Persona p3 = new Persona("angel", "gomez", 10);
		Persona p4 = new Persona("david", "perez", 70);
		
		
		
		List<Persona> lista = Arrays.asList(p1, p2, p3, p4);

		
		Stream<Persona> flujo=lista.stream();
		//Consumer es complementario a un predicate
		flujo
		//.peek((p)->System.out.println("///"+p.getNombre()+"///"))
		.filter((p)->p.getEdad()>18)
		//.peek((p)->System.out.println("*"+p.getNombre()+"*"))
		.map((p)->p.getEdad()+2)
		.map((e)->e+2)
		.forEach((e)->System.out.println("la edad final mas los años es "+ e));
	}

	// lista de facturas el importe mas el iva de cada factura de la lista
	// trabajados como uns stream de datos
	
}
