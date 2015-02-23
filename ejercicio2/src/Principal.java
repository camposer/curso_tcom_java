
public class Principal {
	public static void main(String[] args) {
		Persona a = new Persona();
		Persona b = new Persona("Juan");
		Persona c = new Persona("María", 1.80f);
		Persona d = new Persona("Eva", 1.7f, 20);
		
		Persona e = new Persona();
		e.setNombre(b.getNombre());
		e.setEdad(b.getEdad());
		e.setAltura(b.getAltura());

		a = b;
		c = b;
		
		a.setNombre("Pedro"); // Cambia en b y en c (es el mismo objeto!!)
		System.out.println(a);
		System.out.println(b.toString());
		System.out.println(c);
		
		b = c = a = null;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
