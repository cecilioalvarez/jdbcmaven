package com.arquitecturajava.jpa;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PrincipalJPA {

	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("curso");
		
		EntityManager em= emf.createEntityManager();
		
		Persona p= em.find(Persona.class, "juan");
		
		System.out.println(p.getNombre());
		System.out.println(p.getApellidos());
		
		
		
	}
}
