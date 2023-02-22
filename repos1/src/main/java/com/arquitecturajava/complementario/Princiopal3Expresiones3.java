package com.arquitecturajava.complementario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Princiopal3Expresiones3 {

	public static void main(String[] args) {
		
		String texto="hola caracola hola hola";
		Pattern patronBusqueda = Pattern.compile("hola");
		Matcher coincidencias = patronBusqueda.matcher(texto);
		
		int contador=0;
		while(coincidencias.find()) {
				System.out.println(coincidencias.start());
				System.out.println(coincidencias.end());
			
		}
		System.out.println(contador);
		

	}

}
