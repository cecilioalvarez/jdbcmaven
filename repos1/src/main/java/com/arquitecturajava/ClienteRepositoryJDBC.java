package com.arquitecturajava;

import java.util.List;

public class ClienteRepositoryJDBC implements ClienteRepository {

	@Override
	public List<Cliente> buscarTodos() {

		String sql = "select * from Clientes";
		return getHelper().seleccionar(sql, Cliente.class);

	}

	private DataBaseHelper getHelper() {
		DataBaseHelper helper = new DataBaseHelper();
		return helper;
	}

	@Override
	public Cliente buscarUno(int id) {

		String sql = "select * from Clientes where id ='" + id + "'";
		return getHelper().seleccionar(sql, Cliente.class).get(0);

	}

	@Override
	public void insertar(Cliente cliente) {

		String sql = "insert into Clientes  (id,nombre) values ('" + cliente.getId() + "','" + cliente.getNombre()
				+ "')";
		getHelper().actualizar(sql);

	}

	@Override
	public void borrar(Cliente cliente) {

		String sql = "delete from Clientes where id='" + cliente.getId() + "'";

		getHelper().actualizar(sql);

	}

	@Override
	public void actualizar(Cliente cliente) {

		String sql = "update Cliente set nombre='" + cliente.getNombre() + " where id='" + cliente.getId() + "'";

		getHelper().actualizar(sql);

	}

}
