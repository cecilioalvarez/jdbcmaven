package com.arquitecturajava.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Principal2JPA {

	public static void main(String[] args) {
		
		
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("curso");
		
		EntityManager em= emf.createEntityManager();
		
		Persona p = new Persona("pepito","gonzalez",20);
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}
}
