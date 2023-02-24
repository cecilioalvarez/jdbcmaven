package com.arquitecturajava.jpa;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

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
