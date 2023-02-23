package com.arquitecturajava.patrones.funcional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal6 {

	public static void main(String[] args) {
	
		
		Persona p1= new Persona("pedro","gomez",20);
		Persona p2= new Persona("angel","alvarez",10);
		Persona p3= new Persona("david","perez",70);
		List<Persona> lista=Arrays.asList(p1,p2,p3);
		
		// la funcion recibe persona 1 , persona 2 y 
		// devuelve un numero dpeendiendo sde su orden
		
		Collections.sort(lista, (Persona o1,Persona o2)-> o1.getApellidos().compareTo(o2.getApellidos()));
		
		for (Persona p: lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
		}
		

	}

}
