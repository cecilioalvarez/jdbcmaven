package com.arquitecturajava.patrones.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal9 {

	public static void main(String[] args) {
	
		
		Persona p1= new Persona("pedro","gomez",20);
		Persona p2= new Persona("angel","alvarez",10);
		Persona p3= new Persona("angel","gomez",10);
		Persona p4= new Persona("david","perez",70);
		List<Persona> lista=Arrays.asList(p1,p2,p3,p4);
		
		FiltroPersona f1= (p)->p.getApellidos().equals("alvarez");
			
		
		lista= filtrarPersonas(f1, lista);
		
		for (Persona p: lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getApellidos());
		}
		

	}
	
	public static List<Persona> filtrarPersonas(FiltroPersona filtro ,List<Persona> lista) {
		
		List<Persona> listaFiltro= new ArrayList<Persona>();
		
		for (Persona p: lista) {
			
			if (filtro.test(p)) listaFiltro.add(p);
			
		}
		return listaFiltro;
	}

}
