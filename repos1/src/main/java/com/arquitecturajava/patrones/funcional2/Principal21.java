package com.arquitecturajava.patrones.funcional2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal21 {

	public static void main(String[] args) {

		Factura f1 = new Factura("1", "ordenador", 200);
		Factura f2 = new Factura("2", "tablet", 500);
		Factura f3 = new Factura("3", "movil", 700);

		//Function<Factura,Double> mifuncion= (f) -> f.getImporte() * 1.21;
		
		List<Factura> lista = Arrays.asList(f1, f2, f3);
		Stream<Factura> flujo = lista.stream();
		
		var resultadoTotal=flujo
		.peek((e)->System.out.println(e))
		.map(Factura::getImporte)
		.peek((e)->System.out.println("importe "+e))
		.reduce((total, elemento)->total+(elemento+5));
		
		
		if(resultadoTotal.isPresent()) {
			
			System.out.println(resultadoTotal.get());
	
		}
		
		int total=0;
		for (int i=0;i<10;i++) {
			
			total+= i;
		}
	
		
		
		
		
	}
}
