package com.arquitecturajava;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteRepositoryTest {

	@BeforeEach
	public void setup() {
		
		DataBaseHelper helper= new DataBaseHelper();
		helper.actualizar("truncate table clientes");
		helper.actualizar("insert into Clientes values (1,'juan')");
		helper.actualizar("insert into Clientes values (2,'miguel')");
	}
	
	@Test
	void buscarTodosClientesTest() {
		
		
		ClienteRepository repo= new ClienteRepositoryJDBC();
		List<Cliente> lista=repo.buscarTodos();
		assertEquals(2,lista.size());
		
	}
	
	@Test
	void insertarClienteTest() {
		
		
		ClienteRepository repo= new ClienteRepositoryJDBC();
		repo.insertar(new Cliente(3,"juan"));
		List<Cliente> lista=repo.buscarTodos();
		assertEquals(3,lista.size());
	}

}
