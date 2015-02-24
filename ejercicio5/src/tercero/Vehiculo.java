package tercero;

public class Vehiculo {
	protected String duenio;
	protected int puertas;
	protected int ruedas;
	
	public Vehiculo() {
			
	}
	
	public Vehiculo(String duenio, int puertas, int ruedas) {
		this.duenio = duenio;
		this.puertas = puertas;
		this.ruedas = ruedas;
	}
	
	@Override
	protected void finalize() throws Throwable { // ~Vehiculo()
		System.out.println("Destruyendo el Vehiculo");
	}
	
	public void caracteristicas() {
		System.out.println("dueño = " + duenio + 
				", puertas = " + puertas +
				", ruedas = " + ruedas);
	}
}
