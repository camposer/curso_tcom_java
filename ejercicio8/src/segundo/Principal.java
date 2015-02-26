package segundo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new Gerente("Gerente #1", 3000, null, null));
		empleados.add(new Gerente("Gerente #2", 3500, null, null));
		
		Director d = new Director();
		d.nombre = "Director #1";
		d.salario = 4000;
		empleados.add(d);
		
		d = new Director();
		d.nombre = "Director #2";
		d.salario = 5000;
		empleados.add(d);
		
		empleados.add(new Empleado("Empleado #1", 2000, null));
		
		imprimir(empleados);
		
		System.out.println("********************");
		Collections.sort(empleados, new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return (int)Math.ceil(o1.salario - o2.salario);
			}
		});
		
		imprimir(empleados);
		
	}

	private static void imprimir(List<Empleado> empleados) {
		for (Empleado e: empleados) 
			System.out.println(e);
	}
}





