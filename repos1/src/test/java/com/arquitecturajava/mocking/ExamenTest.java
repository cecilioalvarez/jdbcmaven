package com.arquitecturajava.mocking;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class ExamenTest {

	@Test
	void test() {
		
		//arrange
		Nota nota= mock(Nota.class);
		when(nota.estaAprobada()).thenReturn(true);
		
		
		Examen examen= new Examen(LocalDate.now(),nota);
		boolean aprobado=examen.estaAprobado();
		assertTrue(aprobado);
		
	}

}
