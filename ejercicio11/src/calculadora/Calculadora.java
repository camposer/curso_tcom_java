package calculadora;


public class Calculadora {
	public static final String SUMAR = "sumar";
	public static final String RESTAR = "restar";
	public static final String MULTIPLICAR = "multiplicar";
	public static final String DIVIDIR = "dividir";
	
	public double sumar(double a, double b) {
		return a + b;
	}
	
	public double restar(double a , double b) {
		return a - b;
	}
	
	public double multiplicar(double a, double b) {
		return a * b;
	}
	
	public double dividir(double a, double b) {
		return a / b;
	}
}
