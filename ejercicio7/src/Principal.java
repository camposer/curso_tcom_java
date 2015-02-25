import calculadora.Calculadora;
import exception.DivisorInvalidoException;
import exception.NaturalInvalidoException;
import exception.SustraendoInvalidoException;

public class Principal {
	public static void main(String[] args) {
		bordes();
		sumar();
		restar();
		multiplicar();
		dividir();
	}

	private static void dividir() {
		try {
			System.out.println(Calculadora.dividir(4, 2));
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		} catch (DivisorInvalidoException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(Calculadora.dividir(3, 2));
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		} catch (DivisorInvalidoException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(Calculadora.dividir(3, 0));
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		} catch (DivisorInvalidoException e) {
			e.printStackTrace();
		}
	}

	private static void bordes() {
		try {
			System.out.println(Calculadora.restar(-3, 2));
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		} catch (SustraendoInvalidoException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(Calculadora.restar(3, -2));
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		} catch (SustraendoInvalidoException e) {
			e.printStackTrace();
		}
	}

	private static void multiplicar() {
		try {
			System.out.println(Calculadora.multiplicar(2, 3));
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(Calculadora.multiplicar(Integer.MAX_VALUE, 2));
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		}
		
	}

	private static void restar() {
		try {
			System.out.println(Calculadora.restar(3, 2));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		try {
			System.out.println(Calculadora.restar(2, 3));
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		} catch (SustraendoInvalidoException e) {
			e.printStackTrace();
		}
	}

	private static void sumar() {
		try {
			System.out.println(Calculadora.sumar(2, 3));
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(Calculadora.sumar(Integer.MAX_VALUE, 1));
		} catch (NaturalInvalidoException e) {
			e.printStackTrace();
		}
	}
}
