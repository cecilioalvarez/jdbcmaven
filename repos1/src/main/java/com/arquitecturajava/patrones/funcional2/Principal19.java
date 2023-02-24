package com.arquitecturajava.patrones.funcional2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal19 {

	public static void main(String[] args) {

		Factura f1 = new Factura("1", "ordenador", 200);
		Factura f2 = new Factura("2", "tablet", 500);
		Factura f3 = new Factura("3", "movil", 700);

		//Function<Factura,Double> mifuncion= (f) -> f.getImporte() * 1.21;
		
		List<Factura> lista = Arrays.asList(f1, f2, f3);
		Stream<Factura> flujo = lista.stream();
		
		//un resultado de una operacion 
		// ese resultado siempre podia existir o no existir
		// sino existia pues devolvia un null
		// si existia devolvia un objeto
		Optional<Factura> oFactura=flujo.filter(f->f.getConcepto().equals("tablet")).findFirst();
	
		if(oFactura.isPresent()) {
			
			System.out.println(oFactura.get().getConcepto());
		}
		
		
	}
}
