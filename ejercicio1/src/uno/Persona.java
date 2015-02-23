package uno;

public class Persona {
	private int edad;
	private float altura;
	private String nombre;
	
	public Persona() {
		edad = 20;
		altura = 1.80f;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void caminar() {
		System.out.println("Estoy caminando...");
	}
}
