package tercero;

public class Auto extends Vehiculo {
	private boolean descapotable;
	
	public Auto() { }
	
	public Auto(String duen, int puertas, int ruedas, boolean descapotable) {
		duenio = duen;
		super.puertas = puertas;
		this.ruedas = ruedas;
		this.descapotable = descapotable;
	}
	

	public void caracteristicas() {
		System.out.println("dueño = " + duenio +
				", puertas = " + super.puertas + 
				", ruedas = " + this.ruedas + 
				", descapotable = " + this.descapotable);
	}
	
	public void subir() {
		System.out.println("Subiendo como Auto");
	}
	
	public void bajar() {
		System.out.println("Bajando como Auto");
	}
}
