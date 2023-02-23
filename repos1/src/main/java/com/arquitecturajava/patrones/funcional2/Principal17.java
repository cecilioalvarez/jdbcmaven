package com.arquitecturajava.patrones.funcional2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal17 {

	public static void main(String[] args) {

		Factura f1 = new Factura("1", "ordenador", 200);
		Factura f2 = new Factura("2", "tablet", 500);
		Factura f3 = new Factura("3", "movil", 700);

		//Function<Factura,Double> mifuncion= (f) -> f.getImporte() * 1.21;
		
		List<Factura> lista = Arrays.asList(f1, f2, f3);
		Stream<Factura> flujo = lista.stream();
		Stream<Factura> flujo2=flujo.filter(f->f.getConcepto().equals("ordenador"));
		List<Factura> listaNueva=flujo2.collect(Collectors.toList());
		
		lista.stream().forEach(System.out::println);
		
		
		
		for (Factura f: listaNueva) {
			
			System.out.println(f.getConcepto());
		}
	}
}
