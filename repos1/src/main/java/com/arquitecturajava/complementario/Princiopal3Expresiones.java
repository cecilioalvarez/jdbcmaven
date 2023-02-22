package com.arquitecturajava.complementario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Princiopal3Expresiones {

	public static void main(String[] args) {
		
		String texto="hola caracola";
		Pattern patronBusqueda = Pattern.compile("hola caracola");
		Matcher coincidencias = patronBusqueda.matcher(texto);
		
		if (coincidencias.matches()) {
			
			System.out.println("encontrado");
			
		}else {
			
			System.out.println("no encontrado");
		}
		
		
		

	}

}
