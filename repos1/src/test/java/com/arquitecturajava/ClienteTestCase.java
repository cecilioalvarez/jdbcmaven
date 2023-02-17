package com.arquitecturajava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteTestCase {

	@Test
	void igualdadClientesIdTest() {
		
		Cliente cliente1= new Cliente (1,"pedro");
		Cliente cliente2= new Cliente (1,"juan");
		
		boolean clientesIguales= cliente1.equals(cliente2);
		
		
		assertTrue(clientesIguales);
		
		
	}
	
	@Test
	void noIgualdadClientesIdTest() {
		
		Cliente cliente1= new Cliente (1,"pedro");
		Cliente cliente2= new Cliente (2,"juan");
		
		boolean clientesIguales= cliente1.equals(cliente2);
		
		
		assertFalse(clientesIguales);
		
		
	}

}
