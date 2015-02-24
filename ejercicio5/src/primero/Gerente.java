package primero;

import java.util.Date;

public class Gerente extends Empleado {
	public String departamento;

	public Gerente() {
		super(null, 0, null);
	}
	
	public Gerente(String nombre, double salario, Date fechaNacimiento, 
			String departamento) {
		super(nombre, salario, fechaNacimiento);
		this.departamento = departamento;
	}

	public String getDetails() {
		return super.getDetails() +
				", departamento = " + departamento;
	}

	@Override
	public String toString() {
		return "Gerente [nombre = " + nombre +
				", salario = " + salario + 
				", departamento=" + departamento + "]";
	}
	
	
}
