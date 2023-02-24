package com.arquitecturajava.jpa;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Principal4 {

	public static void main(String[] args) {

		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso");

			EntityManager em = emf.createEntityManager();

			TypedQuery<Persona> consulta = em.createQuery("select p from Persona p",Persona.class);
			
			List<Persona> personas= consulta.getResultList();
			
			for (Persona p : personas) {
				
				System.out.println(p.getNombre());
				System.out.println(p.getApellidos());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
