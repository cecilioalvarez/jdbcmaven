package com.arquitecturajava.patrones.funcional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
	
		
		Persona p1= new Persona("pedro","gomez",20);
		Persona p2= new Persona("angel","gomez",10);
		Persona p3= new Persona("david","gomez",70);
		List<Persona> lista=Arrays.asList(p1,p2,p3);
		
		Collections.sort(lista, new ComparadorEdad());
		
		for (Persona p: lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
		

	}

}
