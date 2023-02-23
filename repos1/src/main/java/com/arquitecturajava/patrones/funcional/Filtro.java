package com.arquitecturajava.patrones.funcional;


@FunctionalInterface
public interface Filtro<T> {
	
	public boolean test(T tipo);
	
	// los metodos por defecto
	// son pocos y definen una funcionalidad muy generica
	default public Filtro<T> or (Filtro<T> otroFiltro) {
		// genera una nueva expresion lambda que se encarga de combiar lambas
		return (T t) -> { return test(t) || otroFiltro.test (t);};
	}
	
}
