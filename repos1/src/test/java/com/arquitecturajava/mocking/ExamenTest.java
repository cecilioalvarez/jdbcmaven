package com.arquitecturajava.mocking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ExamenTest {

	@Test
	void aprobadotest() {
		
		//arrange
		Nota nota= mock(Nota.class);
		//configuras
		when(nota.estaAprobada()).thenReturn(true);
		
		
		Examen examen= new Examen(LocalDate.now(),nota);
		boolean aprobado=examen.estaAprobado();
		assertTrue(aprobado);
		
	}
	
	@Test
	void suspensotest() {
		
		//arrange
		Nota nota= mock(Nota.class);
		//configuras
		when(nota.estaAprobada()).thenReturn(false);
		
		
		Examen examen= new Examen(LocalDate.now(),nota);
		boolean aprobado=examen.estaAprobado();
		assertFalse(aprobado);
		
	}
	
	@Test
	void comparar2ExamenesTest() {
		
		//arrange
		Nota nota1= mock(Nota.class);
		Nota nota2= mock(Nota.class);
		when(nota1.compareTo(nota2)).thenReturn(-1);
		
		System.out.println(nota1.getValor());
		System.out.println(nota2.getValor());
		
		System.out.println(nota1.compareTo(nota2));
		Examen examen1= new Examen(LocalDate.now(),nota1);
		Examen examen2= new Examen(LocalDate.now(),nota2);
		System.out.println(examen1.compareTo(examen2));
		int mayor= examen1.compareTo(examen2);
	
		assertEquals(1,mayor);
	}

}
