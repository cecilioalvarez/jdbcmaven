package com.arquitecturajava.patrones.funcional2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Principal16 {

	public static void main(String[] args) {

		Factura f1 = new Factura("1", "ordenador", 200);
		Factura f2 = new Factura("2", "ordenador", 500);
		Factura f3 = new Factura("3", "ordenador", 700);

		//Function<Factura,Double> mifuncion= (f) -> f.getImporte() * 1.21;
		
		List<Factura> lista = Arrays.asList(f1, f2, f3);
		Stream<Factura> flujo = lista.stream();
		//uso la sintaxis de :: para referenciar a un metodo que esta en una clase
		// y que claro es una funcion
		flujo.map(Factura::getImporteConIVA).forEach(System.out::println);
	}

}
