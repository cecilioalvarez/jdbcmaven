package com.arquitecturajava.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class PrincipalJPA {

	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("curso");
		
		EntityManager em= emf.createEntityManager();
		
		Persona p= em.find(Persona.class, "antonio");
		
		System.out.println(p.getNombre());
		System.out.println(p.getApellidos());
		
		
		
	}
}
