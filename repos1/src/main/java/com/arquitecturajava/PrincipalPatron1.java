package com.arquitecturajava;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;



public class PrincipalPatron1 {

	public static void main(String[] args) {

	
		
		PersonaRepository repoPersona= new PersonaRepositoryJDBC();
		
		List<Persona> lista=repoPersona.buscarTodos();
	
		System.out.println(lista.size());
		
		for (Persona p:lista) {
			
			System.out.println(p.getNombre());
			System.out.println(p.getEdad());
		}
		 
	
	}

	
	
	

}
