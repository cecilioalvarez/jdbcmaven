package com.arquitecturajava.jpa;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Principal5 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso");

		EntityManager em = emf.createEntityManager();

		TypedQuery<Persona> consulta = em.createQuery("select p from Persona p", Persona.class);

		List<Persona> personas = consulta.getResultList();

		List<PersonaDTOBasico> lista = personas.stream().map((p) -> new PersonaDTOBasico(p.getNombre(), p.getEdad()))
				.collect(Collectors.toList());

		for (PersonaDTOBasico dto : lista) {

			System.out.println(dto.getNombre());
			System.out.println(dto.getEdad());

		}

		personas.stream().map(PersonaDTOBasico::new).forEach(System.out::println);
			

	}

}
