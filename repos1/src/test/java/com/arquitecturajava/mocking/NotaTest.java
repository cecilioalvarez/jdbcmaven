package com.arquitecturajava.mocking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTest {

	@Test
	void notaAprobadaTest() {
		
		
		Nota nota1=new Nota(7);
		Nota nota2= new Nota(4);
		
		boolean aprobada1=nota1.estaAprobada();
		boolean aprobada2= nota2.estaAprobada();
		
		
		assertTrue(aprobada1);
		assertFalse(aprobada2);
		
	}

}
