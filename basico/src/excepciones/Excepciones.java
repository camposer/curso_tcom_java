package excepciones;

public class Excepciones {
	public static void main(String[] args) {
		String numeros[] = new String[] { "1", "2", "tres", "4" };

		System.out.println("La sumatoria es: " + sumatoria1(numeros));
		System.out.println("La sumatoria es: " + sumatoria2(numeros));
		try {
			System.out.println("La sumatoria es: " + sumatoria3(numeros));
		} catch (NumeroInvalidoException e) {
			e.printStackTrace();
		}
		
		System.out.println("2/0 = " + dividir(2, 0));
	}

	public static int sumatoria1(String[] numeros) {
		int sum = 0;

		try {
			for (String n : numeros) {
				sum += Integer.parseInt(n);
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Dato inválido " + nfe.getMessage());
		} finally {
			System.out.println("Finalmente...");
		}

		return sum;
	}

	public static int sumatoria2(String[] numeros) {
		int sum = 0;

		for (String n : numeros) {
			try {
				sum += Integer.parseInt(n);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}

		return sum;
	}

	public static int sumatoria3(String[] numeros) throws NumeroInvalidoException {
		int sum = 0;

		try {
			for (String n : numeros) {
				sum += Integer.parseInt(n);
			}
		} catch (NumberFormatException nfe) {
			throw new NumeroInvalidoException("Numero inválido", nfe);
		} 

		return sum;
	}
	
	public static double dividir(double a, double b) {
		if (b == 0)
			throw new NumeroInvalidoException("El divisor no puede ser 0");
		
		return a / b;
	}
}









