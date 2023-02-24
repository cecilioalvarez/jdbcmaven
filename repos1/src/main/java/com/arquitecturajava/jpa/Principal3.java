package com.arquitecturajava.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Principal3 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso");

		EntityManager em = emf.createEntityManager();

		Persona p = em.find(Persona.class, "pepito");
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();

	}

}
