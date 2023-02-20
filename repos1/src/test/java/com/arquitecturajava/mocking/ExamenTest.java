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

		// arrange
		Nota nota = mock(Nota.class);
		// configuras
		when(nota.estaAprobada()).thenReturn(true);

		Examen examen = new Examen(LocalDate.now(), nota);
		boolean aprobado = examen.estaAprobado();
		assertTrue(aprobado);

	}

	@Test
	void suspensotest() {

		// arrange
		Nota nota = mock(Nota.class);
		// configuras
		when(nota.estaAprobada()).thenReturn(false);

		Examen examen = new Examen(LocalDate.now(), nota);
		boolean aprobado = examen.estaAprobado();
		assertFalse(aprobado);

	}

	@Test
	void comparar2ExamenesTest() {

		// arrange
		Nota nota1 = mock(Nota.class);
		Nota nota2 = mock(Nota.class);

		when(nota1.esMayor(nota2)).thenReturn(1);
		when(nota2.esMayor(nota1)).thenReturn(-1);
		when(nota1.esMayor(nota1)).thenReturn(0);
		when(nota2.esMayor(nota2)).thenReturn(0);

		Examen examen1 = new Examen(LocalDate.now(), nota1);
		Examen examen2 = new Examen(LocalDate.now(), nota2);
		Examen examen3 = new Examen(LocalDate.now(), nota2);

		int mayor = examen1.esMayor(examen2);
		int menor = examen2.esMayor(examen1);
		int igual = examen3.esMayor(examen3);
		assertEquals(1, mayor);
		assertEquals(-1, menor);
		assertEquals(0, igual);
	}
	
	@Test
	void esBuenaNota() {

		// arrange
		Nota nota1 = mock(Nota.class);
		when(nota1.esSobreSaliente()).thenReturn(true);
		when(nota1.esNotable()).thenReturn(true);
		

		Examen examen1 = new Examen(LocalDate.now(), nota1);
		
		assertTrue(examen1.esBuenaNota());
		

	
	}
	
	@Test
	void esMalaNota() {

		// arrange
		Nota nota1 = mock(Nota.class);
		when(nota1.esMuyDeficiente()).thenReturn(true);
		when(nota1.esSuspenso()).thenReturn(true);
		

		Examen examen1 = new Examen(LocalDate.now(), nota1);
		
		assertTrue(examen1.esMalaNota());
		

	
	}

}
