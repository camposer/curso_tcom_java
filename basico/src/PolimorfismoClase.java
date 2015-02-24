

import java.util.Date;

public class PolimorfismoClase {
	public static void main(String[] args) {
		Empleado e = new Gerente();
		System.out.println(e.getDetails()); // => El de Gerente
		
		Gerente g = (Gerente)e;
		System.out.println("departamento = " + g.departamento);
		
		Empleado e1 = new Director();
		System.out.println("tieneCoche = " + ((Director)e1).tieneCoche);
		
		Gerente g1 = (Gerente)e1;
		//Director d = (Director)new Empleado(); // => ClassCastException!

		System.out.println("gerente = " + g1);
		
		
		if (e1 instanceof Empleado)
			System.out.println("Soy un empleado");
		if (e1 instanceof Gerente)
			System.out.println("Soy un gerente");
		if (e1 instanceof Director)
			System.out.println("Soy un director");
	}
}

class Empleado {
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

class Gerente extends Empleado {
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

class Director extends Gerente {
	public boolean tieneCoche;
}