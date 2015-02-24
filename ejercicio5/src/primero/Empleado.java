package primero;

import java.util.Date;

public class Empleado {
	public String nombre;
	public double salario;
	public Date fechaNacimiento;
	
	public Empleado(String nombre, double salario, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getDetails() {
		return "nombre = " + this.nombre + 
				", salario = " + salario + 
				", fechaNacimiento = " + fechaNacimiento;
	}
}
