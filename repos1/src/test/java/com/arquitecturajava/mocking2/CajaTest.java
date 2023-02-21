package com.arquitecturajava.mocking2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CajaTest {
	
	Regalo r,r2,r3;
	
	@BeforeEach
	public void setUp() {
		
		r= mock(Regalo.class);
		r2= mock(Regalo.class);
		r3= mock(Regalo.class);
	}

	@Test
	void calcularPrecioTotalTest() {
		
		when(r.getPrecio()).thenReturn(100.0);
		when(r2.getPrecio()).thenReturn(200.0);
		when(r3.getPrecio()).thenReturn(300.0);
		Caja caja= new Caja(r,r2,r3);
		
		
		double precioTotal= caja.getPrecioTotal();
		assertEquals(600,precioTotal);
	}
	
	
	@Test
	void calcularPrecioTotalConIvaConPrecioCajaTest() {
		
		double precioInicial=200;
		double precioInicialConIVA=242;
	
		
		when(r.getPrecioConIVA()).thenReturn(100.0);
		when(r2.getPrecioConIVA()).thenReturn(200.0);
		when(r3.getPrecioConIVA()).thenReturn(300.0);
		
		Caja caja= new Caja(r,r2,r3,200);
		
		double precioTotalConIva= caja.getPrecioTotalConIva();
		assertEquals(842,precioTotalConIva);
	}
	
	@Test
	void calcularPrecioTotalConIvaSinPrecioCajaTest() {
		
		double precioInicial=200;
		double precioInicialConIVA=242;
		
		when(r.getPrecioConIVA()).thenReturn(100.0);
		when(r2.getPrecioConIVA()).thenReturn(200.0);
		when(r3.getPrecioConIVA()).thenReturn(300.0);
		
		
		Caja caja= new Caja(r,r2,r3);
		
		double precioTotalConIva= caja.getPrecioTotalConIva();
		assertEquals(600,precioTotalConIva);
	}
	
	
	@Test
	void obtenerRegaloCajaMasCaroTest() {
		
		double precioInicial=200;
	
		when(r.getPrecio()).thenReturn(100.0);
		when(r2.getPrecio()).thenReturn(700.0);
		when(r3.getPrecio()).thenReturn(300.0);
		
		
		Caja caja= new Caja(r,r2,r3);
		
		
		// if anidada si los objetos tienen precio
		Regalo mayor=caja.getRegaloMasCaro();
		
		assertEquals(r2,mayor);
	}
	
	
	@Test
	void obtenerRegaloCajaMasCaro2Test() {
		
		
		
		//arrange
		Caja caja=mock(Caja.class);
		when(caja.getRegaloMasCaro()).thenReturn(r);
		
		//act invoca el metodo del objeto mock
		Regalo mayor=caja.getRegaloMasCaro();
		//assert confirma que tu mock esta correcto
		assertEquals(r,mayor);
	}
	@AfterEach
	public void tearDown() {
		
		r=null;
		r2=null;
		r3=null;
	}

}
