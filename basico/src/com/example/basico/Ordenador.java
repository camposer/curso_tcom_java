package com.example.basico;

public class Ordenador {
	public int ram = 0;
	private int capacidadDisco;
	int velocidadCpu = 300;
	
	public Ordenador() {
		ram = 16;
		capacidadDisco = 200;
	}
	
	public int getCapacidadDisco() {
		return capacidadDisco;
	}

	public void setCapacidadDisco(int capacidadDisco) {
		if (capacidadDisco > 0)
			this.capacidadDisco = capacidadDisco;
	}

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
