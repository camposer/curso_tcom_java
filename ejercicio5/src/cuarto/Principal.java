package cuarto;

import tercero.Auto;
import tercero.Camioneta;
import tercero.Vehiculo;

public class Principal {
	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[5];
		vehiculos[0] = new Auto();
		vehiculos[1] = new Auto("Juan", 5, 4, true);
		vehiculos[2] = new Camioneta();
		vehiculos[3] = new Camioneta("María", 5, 4, 2.3f, 3.4f);
		vehiculos[4] = new Vehiculo();
		
		for (Vehiculo v : vehiculos) {
			System.out.println(v.getClass().getSimpleName());
			
			v.caracteristicas();
			System.out.println();
		}
	}
}
