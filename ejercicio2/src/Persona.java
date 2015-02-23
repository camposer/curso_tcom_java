

public class Persona {
	private int edad;
	private float altura;
	private String nombre;
	
	public Persona(String nombre) { // sobrecarga de constructores!
		this(nombre, 0f);
//		this.nombre = nombre;
	}
	
	public Persona(String nomb, float altura) {
		this(nomb, altura, 0); // =?
//		this.nombre = nomb;
//		this.altura = altura;
	}
	
	public Persona(String nomb, float altura, int edad) {
		this.nombre = nomb;
		this.altura = altura;
		this.edad = edad;
	}

	public Persona() {
		this(null);
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

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", altura=" + altura + ", nombre="
				+ nombre + "]";
	}
	
	
}
