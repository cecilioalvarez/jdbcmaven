package com.arquitecturajava.complementario;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Princiopal3Expresiones4 {

	public static void main(String[] args) {
		
		String texto="hola caracola hola hola";
		Pattern patronBusqueda = Pattern.compile("hola");
		Matcher coincidencias = patronBusqueda.matcher(texto);
		
		String resultado=coincidencias.replaceAll("adios");
		System.out.println(resultado);
		

	}

}
