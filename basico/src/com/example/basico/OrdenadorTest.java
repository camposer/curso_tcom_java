package com.example.basico;

public class OrdenadorTest {
	public static void main(String[] args) {
		Ordenador o = new Ordenador();
		o.ram = -900;
		// o.capacidadDisco = 20; // Error!
		o.velocidadCpu = 20;
		System.out.println("ram = " + o.ram + 
				", velocidad = " + o.velocidadCpu);
	}
}
