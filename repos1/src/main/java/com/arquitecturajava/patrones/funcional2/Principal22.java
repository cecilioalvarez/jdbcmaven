package com.arquitecturajava.patrones.funcional2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal22 {

	public static void main(String[] args) {

	

		//Function<Factura,Double> mifuncion= (f) -> f.getImporte() * 1.21;
		
		
		Stream<String> flujo = Stream.of("hola","que","tal","estas","hoy","tu");
		
		flujo.map(String::toUpperCase).reduce((a,e)->a+","+e).ifPresent(System.out::println);
		
	
		
		
		
	}
}
