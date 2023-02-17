package com.arquitecturajava;

import java.util.List;

public interface ClienteRepository {

	List<Cliente> buscarTodos();

	Cliente buscarUno(int id);

	void insertar(Cliente cliente);

	void borrar(Cliente cliente);

	void actualizar(Cliente cliente);

}