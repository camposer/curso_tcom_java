package com.example.basico;

import java.util.Date;

public class PolimorfismoClase {
	public static void main(String[] args) {
		Empleado e = new Gerente();
		System.out.println(e.getDetails()); // => El de Gerente
		
		Gerente g = (Gerente)e;
		System.out.println("departamento = " + g.departamento);
		
		Empleado e1 = new Director();
		System.out.println("tieneCoche = " + ((Director)e1).tieneCoche);
		
		Gerente g1 = (Gerente)e1;
		//Director d = (Director)new Empleado(); // => ClassCastException!

		if (e1 instanceof Empleado)
			System.out.println("Soy un empleado");
		if (e1 instanceof Gerente)
			System.out.println("Soy un gerente");
		if (e1 instanceof Director)
			System.out.println("Soy un director");
	}
}

class Empleado {
	public double salario;
	public String nombre;
	public Date fechaNacimiento;
	
	public String getDetails() {
		return "nombre = " + this.nombre + 
				", salario = " + salario + 
				", fechaNacimiento = " + fechaNacimiento;
	}
}

class Gerente extends Empleado {
	public String departamento;
	
	public String getDetails() {
		return super.getDetails() +
				", departamento = " + departamento;
	}
}

class Director extends Gerente {
	public boolean tieneCoche;
}