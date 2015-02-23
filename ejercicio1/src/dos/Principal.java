package dos;

import uno.Persona;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona();
		
		System.out.println("nombre = " + p.getNombre() + 
				", edad = " + p.getEdad() + 
				", altura = " + p.getAltura());
		
		p.setNombre("Juan");
		p.setAltura(1.7f);
		
		System.out.println("nombre = " + p.getNombre() + 
				", edad = " + p.getEdad() + 
				", altura = " + p.getAltura());
		p.caminar();
	}

}
