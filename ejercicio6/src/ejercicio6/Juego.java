package ejercicio6;

public abstract class Juego {
	protected double dinero;
	protected int cantidadJugadores;
	
	public abstract void jugar();
	public void participar() {
		System.out.println("Participando...");
	}

	public Juego(double dinero, int cantidadJugadores) {
		this.dinero = dinero;
		this.cantidadJugadores = cantidadJugadores;
	}
}
