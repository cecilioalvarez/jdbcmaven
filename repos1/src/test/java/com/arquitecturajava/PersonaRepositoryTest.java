package com.arquitecturajava;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaRepositoryTest {

	private static PersonaRepository repoPersona;

	@BeforeAll
	public static void setupUnico() {
		repoPersona = new PersonaRepositoryJDBC();

	}

	@BeforeEach
	public void setup() {

		DataBaseHelper helper = new DataBaseHelper();
		
		helper.actualizar("truncate table Personas");
	
		helper.actualizar("insert into Personas values ('juan','gomez',20)");
		helper.actualizar("insert into Personas values ('miguel','sanchez',30)");

		
	}

	@Test
	void buscarTodosClientesTest() {

		List<Persona> lista = repoPersona.buscarTodos();
		assertEquals(2, lista.size());

	}
	
	@Test
	void buscarTodosOrdenadosAsclientesTest() {

		List<Persona> lista = repoPersona.buscarTodos("nombre","asc");
		assertEquals(2, lista.size());

	}
	
	@Test
	void buscarTodosClientesOrdenadosTest() {

		List<Persona> lista = repoPersona.buscarTodos("nombre");
		assertEquals(2, lista.size());

	}

	@Test
	void insertarClienteTest() {

		repoPersona.insertar(new Persona("pepe", "perez",20));
		List<Persona> lista = repoPersona.buscarTodos();
		assertEquals(3, lista.size());
	}
	
	
	@Test
	void borrarClienteTest() {

		repoPersona.borrar(new Persona("juan"));
		List<Persona> lista = repoPersona.buscarTodos();
		assertEquals(1, lista.size());
	}
	
	
}
