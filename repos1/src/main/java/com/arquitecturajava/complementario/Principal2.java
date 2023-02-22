package com.arquitecturajava.complementario;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Principal2 {

	public static void main(String[] args) {
		
		LocalDate fecha= LocalDate.of(2019, 10, 20);
		
		LocalDate fecha2= LocalDate.of(2022, 11, 10);
		
		LocalDate fechaOtra= fecha2.plus(2,ChronoUnit.DAYS);
		
		System.out.println(fecha.getDayOfMonth());
		System.out.println(fecha.getYear());
		System.out.println(fecha.getMonth());

		Period periodo= Period.between(fecha, fecha2);
		
		System.out.println(periodo.getDays());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getYears());
		
		LocalDateTime fecha3= LocalDateTime.of(2022,10,10,10,10);
		LocalDateTime fecha4= LocalDateTime.of(2022,10,10,12,10);
		
		Duration duracion=Duration.of(3, ChronoUnit.DAYS);
		System.out.println(duracion.getSeconds());
	}

}
