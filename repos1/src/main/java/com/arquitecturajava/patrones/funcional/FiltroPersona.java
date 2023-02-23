package com.arquitecturajava.patrones.funcional;


@FunctionalInterface
public interface FiltroPersona {
	
	public boolean test(Persona persona);
}
