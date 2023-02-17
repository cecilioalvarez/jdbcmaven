package com.arquitecturajava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataBaseHelperTest {
	
	
	@BeforeEach
	public void setup() {

		DataBaseHelper helper = new DataBaseHelper();
		
		helper.actualizar("truncate table Personas");
	
		helper.actualizar("insert into Personas values ('juan','gomez',20)");
		helper.actualizar("insert into Personas values ('miguel','sanchez',30)");

		
	}

	@Test
	void seleccionarTodosPersonasTest() {
		
		
		DataBaseHelper helper= new DataBaseHelper();
		
		List<Persona> lista=helper.seleccionar("select * from Personas", Persona.class);
		
		assertEquals(2,lista.size());
		
	}
	
	
	@Test
	void seleccionarTodosLasFacturasTest() {
		
		
		DataBaseHelper helper= new DataBaseHelper();
		
		List<Factura> lista=helper.seleccionar("select * from Facturas", Factura.class);
		
		assertEquals(2,lista.size());
		
	}

}
