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
	
	@Test
	void notaCompararOtraNotaTest() {
		
		
		Nota nota1=new Nota(7);
		Nota nota2= new Nota(4);
		Nota nota3= new Nota(2);
		Nota nota4= new Nota(4);
		
		int mayor=nota1.esMayor(nota2);
		int menor= nota3.esMayor(nota2);
		int iguales= nota4.esMayor(nota2);
		
		assertEquals(1,mayor);
		assertEquals(-1,menor);
		assertEquals(0,iguales);
		
	}
	
	@Test
	void esNotaNotable() {
		
		
		Nota nota1=new Nota(7.1);
		
		boolean cierto= nota1.esNotable();
		
		assertTrue(cierto);
		
	}
	
	@Test
	void esSobreSaliente() {
		
		
		Nota nota1=new Nota(9.1);
		
		boolean cierto= nota1.esSobreSaliente();
		
		assertTrue(cierto);
		
	}

}
