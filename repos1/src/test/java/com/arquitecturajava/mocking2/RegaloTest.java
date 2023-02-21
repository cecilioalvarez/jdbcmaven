package com.arquitecturajava.mocking2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RegaloTest {

	@Test
	void calcularPrecioConIVATest() {
		
		
		Regalo r= new Regalo(100);
		double precioConIVA=r.getPrecioConIVA();
		assertEquals(121,precioConIVA);
	}

}
