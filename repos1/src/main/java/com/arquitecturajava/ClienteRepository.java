package com.arquitecturajava;

import java.util.List;
import java.util.Optional;

public interface ClienteRepository {

	List<Cliente> buscarTodos();

	Cliente buscarUno(int id);
	
	Optional<Cliente> buscarUno2(int id);

	void insertar(Cliente cliente);

	void borrar(Cliente cliente);

	void actualizar(Cliente cliente);

}