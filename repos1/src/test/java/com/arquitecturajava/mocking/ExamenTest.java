package com.arquitecturajava.mocking;

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
		Nota nota= mock(Nota.class);
		//configuras
		when(nota.estaAprobada()).thenReturn(false);
		
		
		Examen examen= new Examen(LocalDate.now(),nota);
		boolean aprobado=examen.estaAprobado();
		assertFalse(aprobado);
		
	}

}
