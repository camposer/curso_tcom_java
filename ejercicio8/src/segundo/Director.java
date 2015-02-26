package segundo;

public class Director extends Gerente {
	public boolean tieneCoche;

	@Override
	public String toString() {
		return "Director [tieneCoche=" + tieneCoche + ", departamento="
				+ departamento + ", nombre=" + nombre + ", salario=" + salario
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}