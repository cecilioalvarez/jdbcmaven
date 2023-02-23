package com.arquitecturajava.patrones.funcional2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal18 {

	enum Level {
		  LOW,
		  MEDIUM,
		  HIGH
		}
	
	public static void main(String[] args) {

		Level nivel= Level.LOW;
		
		
		System.out.println(Level.valueOf("LOW"));
	}
}
