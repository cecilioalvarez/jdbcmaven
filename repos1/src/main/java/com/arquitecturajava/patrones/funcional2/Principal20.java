package com.arquitecturajava.patrones.funcional2;

import java.util.Optional;

import com.arquitecturajava.Cliente;
import com.arquitecturajava.ClienteRepository;
import com.arquitecturajava.ClienteRepositoryJDBC;

public class Principal20 {

	public static void main(String[] args) {
		
		
		ClienteRepository repo= new ClienteRepositoryJDBC();
		Optional<Cliente> c=repo.buscarUno2(1);
		
		c.get().getNombre();
		if(c.isPresent()) {
			
			Cliente micliente=c.get();
			System.out.println(micliente.getNombre());
		}
		
	}

}
