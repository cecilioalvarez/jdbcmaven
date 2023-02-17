package com.arquitecturajava;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ClienteRepositoryTest {

	@Test
	void buscarTodosTest() {
		
		
		ClienteRepository repo= new ClienteRepositoryJDBC();
		List<Cliente> lista=repo.buscarTodos();
		assertEquals(2,lista.size());
		
	}

}
