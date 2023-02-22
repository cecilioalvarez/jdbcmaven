package com.arquitecturajava.patrones;

import java.util.List;

public interface FacturaRepository {

	public List<Factura> buscarTodos();
	public void insertar(Factura factura);
}
