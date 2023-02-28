package com.arquitecturajava.jpa;

import com.speedment.jpastreamer.application.JPAStreamer;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal6 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso");
		JPAStreamer jpaStreamer = JPAStreamer.of(emf);
		
		jpaStreamer.stream(Persona.class) 
	    .forEach(System.out::println);
	}
}
