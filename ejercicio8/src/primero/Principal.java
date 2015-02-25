package primero;

import java.util.HashSet;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {
		Set<Persona> personas = new HashSet<Persona>();
		personas.add(new Persona("Juan", 1.8f, 20));
		personas.add(new Persona("Juan", 1.8f, 20));
		personas.add(new Persona("María", 1.6f, 24));
		personas.add(new Persona("Pedro", 1.6f, 24));
		
		
		for (Persona p : personas)
			System.out.println(p);
	}
}
