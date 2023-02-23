package com.arquitecturajava.patrones.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Principal13 {

	public static void main(String[] args) {
	
		
		Persona p1= new Persona("pedro","gomez",20);
		Persona p2= new Persona("angel","alvarez",10);
		Persona p3= new Persona("angel","gomez",10);
		Persona p4= new Persona("david","perez",70);
		List<Persona> lista=Arrays.asList(p1,p2,p3,p4);
		
		//infiere los tipos
		//FiltroPersona f1= (Persona p)->p.getApellidos().equals("alvarez");
		Predicate<Persona>f2= (Persona p)->p.getNombre().equals("pedro");
		
		
		Predicate<Persona> combinado= f2.and(p->p.getApellidos().equals("gomez"));
	
		
		lista= filtrarPersonas(combinado, lista);
		
		for (Persona p: lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
		}
		

	}
	
	public static  List<Persona> filtrarPersonas(Predicate<Persona> filtro ,List<Persona> lista) {
		
		List<Persona> listaFiltro= new ArrayList<Persona>();
		
		for (Persona p: lista) {
			
			if (filtro.test(p)) listaFiltro.add(p);
			
		}
		return listaFiltro;
	}

}

// hay q crear la clase factura
// la clase factura tiene un filtrado por el campo  que queramos
// desarrollamos el interface y dos clases que lo implemen
// probamos el código en un programa main
// añadimos lambdas
