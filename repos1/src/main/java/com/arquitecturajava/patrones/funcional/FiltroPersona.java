package com.arquitecturajava.patrones.funcional;


@FunctionalInterface
public interface FiltroPersona {
	
	public boolean test(Persona persona);
	
	// los metodos por defecto
	// son pocos y definen una funcionalidad muy generica
	default public FiltroPersona or (FiltroPersona otroFiltro) {
		// genera una nueva expresion lambda que se encarga de combiar lambas
		return (Persona p) -> { return test(p) || otroFiltro.test (p);};
	}
	
}
