package primero;


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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
			return false;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", altura=" + altura + ", nombre="
				+ nombre + "]";
	}
	
	
}
