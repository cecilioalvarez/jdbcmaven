package com.arquitecturajava.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
