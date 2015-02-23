package com.example.basico;

public class Ordenador {
	public int ram;
	private int capacidadDisco;
	int velocidadCpu;
	
	//Enciende (comentario normal)
	// Visibilidad pública
	public void encender() { 
		System.out.println("Estoy encendiendo...");
	}
	
	/* Apaga (comentario multilínea) 
	 * Visibilidad privada 
	 */
	private void apagar() { 
		System.out.println("Estoy apagando...");
	}
	
	/**
	 * Reinicia (documentación)
	 * Visibilidad de paquete
	 */
	void reiniciar() {
		System.out.println("Estoy reiniciando");
	}
}
