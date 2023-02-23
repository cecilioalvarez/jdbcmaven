package com.arquitecturajava.patrones.funcional;

import java.util.Comparator;

public class ComparadorApellidos implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getApellidos().compareTo(o2.getApellidos());
	}

}
