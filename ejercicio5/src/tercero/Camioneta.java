package tercero;

public class Camioneta extends Vehiculo {
	private float tara;
	private float carga;
	
	public Camioneta() {
		// super() // Implicitamente!!!
	}
	
	public Camioneta(String duen, int puertas, int ruedas, float tara, float carga) {
		super(duen, puertas, ruedas);
		this.tara = tara;
		this.carga = carga;
	}
	
	
	public void caracteristicas() {
		System.out.println("dueño = " + duenio +
				", puertas = " + super.puertas + 
				", ruedas = " + this.ruedas + 
				", tara = " + this.tara + 
				", carga = " + this.carga);
	}

	public void cargar(float kilos) {
		System.out.println("Cargando " + kilos + " kilos como Camioneta");
	}
}
