package com.arquitecturajava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConfiguradorDBTest {

	@Test
	void cargaPropiedadesBaseDatosTest() {

		ConfiguradorDB configurador = ConfiguradorDB.getInstance();

		assertEquals("jdbc:mysql://localhost:3306/boot", configurador.getUrl());
		assertEquals("root", configurador.getUser());
		assertEquals("root", configurador.getPassword());

	}

}
