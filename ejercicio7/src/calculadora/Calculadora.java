package calculadora;

import exception.DivisorInvalidoException;
import exception.NaturalDesbordadoException;
import exception.NaturalInvalidoException;
import exception.SustraendoInvalidoException;

public class Calculadora {
	
	private static void validarEntero(int n) throws NaturalInvalidoException {
		if (n < 0)
			throw new NaturalInvalidoException(n + " no es un número natural");
	}
	
	public static int sumar(int a, int b) throws NaturalInvalidoException, NaturalDesbordadoException {
		validarEntero(a);
		validarEntero(b);
		
		if (((long)a + b) > Integer.MAX_VALUE)
			throw new NaturalDesbordadoException();
		
		return a + b;
	}
	
	public static int restar(int a, int b) throws NaturalInvalidoException, SustraendoInvalidoException {
		validarEntero(a);
		validarEntero(b);
		
		if (b > a)
			throw new SustraendoInvalidoException();
		
		return a - b;
	}

	public static int multiplicar(int a, int b) throws NaturalInvalidoException {
		validarEntero(a);
		validarEntero(b);
		
		if (((long)a * b) > Integer.MAX_VALUE)
			throw new NaturalDesbordadoException();

		return a * b;
	}

	public static int dividir(int a, int b) throws NaturalInvalidoException, DivisorInvalidoException {
		validarEntero(a);
		validarEntero(b);
		
		if (b == 0)
			throw new DivisorInvalidoException();
		if (a % b != 0)
			throw new NaturalInvalidoException(
					"El resultado de la división no es natural, mod = " + 
							(a % b));

		return a / b;
	}

}




