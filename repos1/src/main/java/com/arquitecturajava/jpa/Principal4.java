package com.arquitecturajava.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

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
