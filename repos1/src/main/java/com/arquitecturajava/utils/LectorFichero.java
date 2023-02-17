package com.arquitecturajava.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LectorFichero {

	
	private String ruta;

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public LectorFichero(String ruta) {
		super();
		this.ruta = ruta;
	}
	
	
	public List<String> leerLineas() {
		
		
		List<String> lineas = null;
		try {
			lineas = Files.readAllLines(Paths.get(ruta));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return lineas;
		
	}
	
	
	
}
