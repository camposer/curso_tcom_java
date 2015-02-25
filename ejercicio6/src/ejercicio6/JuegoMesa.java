package ejercicio6;

public abstract class JuegoMesa extends Juego {
	protected String nombre;
	protected int puntuacion;
	
	public JuegoMesa() {
		this(null, 0);
	}

	public JuegoMesa(String nombre, int puntuacion) {
		this(0, 0, nombre, puntuacion);
	}

	public JuegoMesa(double dinero, int cantidadJugadores, 
			String nombre, int puntuacion) {
		super(dinero, cantidadJugadores);
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	
}
