package com.arquitecturajava.mocking;

import java.util.ArrayList;
import java.util.List;

public class GrupoExamenes {

	private List<Examen> examenes= new ArrayList<Examen>() ;

	public List<Examen> getExamenes() {
		return examenes;
	}

	public void setExamenes(List<Examen> examenes) {
		this.examenes = examenes;
	}

	public GrupoExamenes(List<Examen> examenes) {
		super();
		this.examenes = examenes;
	}
	
	
}
