package com.arquitecturajava.patrones;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
	
		FacturacionService servicio = crearServicio();
		
		List<Cliente> lista=servicio.buscarTodosLosClientes();
		
		for (Cliente c: lista) {
			
			System.out.println(c.getNombre());
			System.out.println(c.getId());
		}
	}

	private static FacturacionService crearServicio() {
		ClienteRepository repoCliente= new ClienteRepositoryJDBC();
		FacturaRepository repoFactura= new FacturaRepositoryJDBC();
		
		FacturacionService servicio= new FacturacionService(repoCliente, repoFactura);
		return servicio;
	}

}
