package colecciones;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Maps {
	public static void main(String[] args) {
		Map<String, Persona> personas = new Hashtable<String, Persona>();
		personas.put("12345678Z", new Persona("Juan", "Pérez"));
		personas.put("91011121T", new Persona("María", "González"));
		personas.put("17181920W", new Persona("Pedro", "García"));
		
		personas.put("12345678Z", new Persona("Pepe", "Pérez"));
		
		Persona p = personas.get("12345678Z");
		System.out.println("La persona con el DNI=12345678Z es " + p);
		
		// Todas las claves
		Set<String> claves = personas.keySet();
		for (String c : claves)
			System.out.println(c);
		
		// Todos los valores
		System.out.println("**************");
		Collection<Persona> valores = personas.values();
		for (Persona v : valores)
			System.out.println(v);
		
		
	}
}

class Persona {
	public String nombre;
	public String apellido;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
}
