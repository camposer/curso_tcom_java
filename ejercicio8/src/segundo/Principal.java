package segundo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new Gerente());
		empleados.add(new Gerente());
		empleados.add(new Director());
		empleados.add(new Director());
		empleados.add(new Empleado(null, 0, null));
		
		for (Empleado e: empleados) 
			System.out.println(e);
	}
}
