package primero;

public class Principal {
	public static void main(String[] args) {
		Director d = new Director();
		Empleado g = new Gerente();
		
		Empleado[] empleados = new Empleado[] {
				g,
				new Gerente(),
				new Director(),
				d,
				new Empleado(null, 0, null)
		};
		
		for (Empleado e : empleados) {
			String cargo = "Empleado";
			
			if (e instanceof Director)
				cargo = "Director";
			else if (e instanceof Gerente) 
				cargo = e.getClass().getSimpleName();
			
			System.out.println("Es un " + cargo);
		}
		
	}
}
