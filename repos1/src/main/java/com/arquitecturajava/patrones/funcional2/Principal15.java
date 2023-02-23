package com.arquitecturajava.patrones.funcional2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Principal15 {

	public static void main(String[] args) {

		Factura f1 = new Factura("1", "ordenador", 200);
		Factura f2 = new Factura("2", "ordenador", 500);
		Factura f3 = new Factura("3", "ordenador", 700);

		List<Factura> lista = Arrays.asList(f1, f2, f3);
		Stream<Factura> flujo = lista.stream();
		flujo.map((f) -> f.getImporte() * 1.21).forEach((d) -> System.out.println(d));
	}

}
