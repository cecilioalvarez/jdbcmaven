package com.arquitecturajava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteRepositoryTest {

	private static ClienteRepository repoCliente;

	@BeforeAll
	public static void setupUnico() {
		repoCliente = new ClienteRepositoryJDBC();

	}

	@BeforeEach
	public void setup() {

		DataBaseHelper helper = new DataBaseHelper();
		helper.actualizar("truncate table clientes");
		helper.actualizar("insert into Clientes values (1,'juan')");
		helper.actualizar("insert into Clientes values (2,'miguel')");

	}

	@Test
	void buscarTodosClientesTest() {

		List<Cliente> lista = repoCliente.buscarTodos();
		assertEquals(2, lista.size());

	}

	@Test
	void insertarClienteTest() {

		repoCliente.insertar(new Cliente(3, "juan"));
		List<Cliente> lista = repoCliente.buscarTodos();
		assertEquals(3, lista.size());
	}

}
