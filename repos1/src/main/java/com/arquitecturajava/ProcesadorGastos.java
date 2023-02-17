package com.arquitecturajava;

import java.util.ArrayList;
import java.util.List;



public class ProcesadorGastos {

	private List<String> lineasGastos;

	public List<String> getLineasGastos() {
		return lineasGastos;
	}

	public void setLineasGastos(List<String> lineas) {
		this.lineasGastos = lineas;
	}

	public ProcesadorGastos(List<String> lineas) {
		super();
		this.lineasGastos = lineas;
	}
	
	public List<Cliente> procesar() {
		
		List<Cliente> listaClientes= new ArrayList<>();
		
		for (String linea: lineasGastos) {
			
			String[] segmentos= linea.split(",");
			Cliente cliente= new Cliente (Integer.parseInt(segmentos[0]),segmentos[1]);
			
			Gasto g1= new Gasto(segmentos[3],Double.parseDouble(segmentos[2]));
			Gasto g2= new Gasto(segmentos[5],Double.parseDouble(segmentos[4]));
			
			cliente.add(g1);
			cliente.add(g2);
			listaClientes.add(cliente);
			
		}
		return  listaClientes;
	}
	
	
	
}
