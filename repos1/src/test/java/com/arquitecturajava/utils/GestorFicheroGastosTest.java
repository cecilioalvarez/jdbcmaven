package com.arquitecturajava.utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class GestorFicheroGastosTest {

	@Test
	void test() {
	
		
		LectorFichero gestor= new LectorFichero("datos.txt");
		
		List<String> lineas=gestor.leerLineas();
		
		assertEquals (2,lineas.size());
	}

}
