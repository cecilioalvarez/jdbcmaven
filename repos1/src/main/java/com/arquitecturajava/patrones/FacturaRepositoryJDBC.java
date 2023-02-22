package com.arquitecturajava.patrones;

import java.util.List;

import com.arquitecturajava.DataBaseHelper;

public class FacturaRepositoryJDBC implements FacturaRepository{

	@Override
	public List<Factura> buscarTodos() {

		String sql = "select * from Facturas";
		return getHelper().seleccionar(sql, Factura.class);

	}

	private DataBaseHelper getHelper() {
		DataBaseHelper helper = new DataBaseHelper();
		return helper;
	}

	

	@Override
	public void insertar(Factura factura) {

		String sql = "insert into Facturas  (numero,concepto,importe) values ('" +
		factura.getNumero() + "','" +factura.getConcepto()
				+ "'," + factura.getImporte()+")";
		getHelper().actualizar(sql);

	}


}
