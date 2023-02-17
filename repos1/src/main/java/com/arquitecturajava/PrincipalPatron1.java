//package com.arquitecturajava;
//
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//
//import com.arquitecturajava.utils.LectorFichero;
//
//
//
//public class PrincipalPatron1 {
//
//	public static void main(String[] args) {
//
//	
//		
//		LectorFichero lector= new LectorFichero("datos.txt");
//		List<String> lineas=lector.leerLineas();
//		ProcesadorGastos procesador= new ProcesadorGastos(lineas);
//		List<Cliente> listaClientes= procesador.procesar();
//		ClienteRepository repo= new ClienteRepositoryJDBC();
//		
//		
//		
//		for (Cliente c:listaClientes) {
//			
//			repo.insertar(c);
//		}
//		
//		
//		 
//	
//	}
//
//	
//	
//	
//
//}
