package com.arquitecturajava.patrones;

import java.util.List;

public class FacturacionService {

	//interfaces
	private ClienteRepository repoCliente;
	private FacturaRepository repoFactura;
	
	
	public FacturacionService(ClienteRepository repoCliente, FacturaRepository repoFactura) {
		super();
		this.repoCliente = repoCliente;
		this.repoFactura = repoFactura;
	}


	public List<Cliente> buscarTodosLosClientes() {
		return repoCliente.buscarTodos();
	}

	public List<Factura> buscarTodasLasFacturas() {
		return repoFactura.buscarTodos();
	}

	public Cliente buscarUnCliente(int id) {
		return repoCliente.buscarUno(id);
	}




	public void insertarFactura(Factura factura) {
		repoFactura.insertar(factura);
	}


	public void insertarCliente(Cliente cliente) {
		repoCliente.insertar(cliente);
	}


	public void borrarCliente(Cliente cliente) {
		repoCliente.borrar(cliente);
	}


	public void actualizarCliente(Cliente cliente) {
		repoCliente.actualizar(cliente);
	}
	
}
