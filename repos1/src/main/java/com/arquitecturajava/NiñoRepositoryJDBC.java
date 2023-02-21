package com.arquitecturajava;

import java.util.List;

public class NiñoRepositoryJDBC implements NiñoRepositorio {

	@Override
	public List<NiñoDTO> buscarTodos() {
		String sql = "select Niños.nombre as nombre ,edad,precio, Regalos.nombre as NombreRegalo from Niños inner Join Regalos on Niños.nombre=Regalos.niño_nombre";
		return getHelper().seleccionar(sql, NiñoDTO.class);
		
	}
	
	private DataBaseHelper getHelper() {
		DataBaseHelper helper = new DataBaseHelper();
		return helper;
	}

}
