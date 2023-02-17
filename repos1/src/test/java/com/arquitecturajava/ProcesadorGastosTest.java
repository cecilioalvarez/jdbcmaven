package com.arquitecturajava;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.utils.LectorFichero;

class ProcesadorGastosTest {

	@Test
	void procesarLineasTest() {
	
		LectorFichero lector= new LectorFichero("datos.txt");
		List<String> lineasGastos= lector.leerLineas();
		ProcesadorGastos procesador= new ProcesadorGastos(lineasGastos);
		
		
		List<Cliente> listaClientes=procesador.procesar();
	
		
		assertEquals(listaClientes, List.of(new Cliente(1,"pedro"),new Cliente(2,"juan")));
	}


}
