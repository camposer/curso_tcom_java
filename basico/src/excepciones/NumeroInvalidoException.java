package excepciones;

// Excepción verficada!
public class NumeroInvalidoException extends RuntimeException {
	public NumeroInvalidoException(String mensaje) {
		super(mensaje);
	}

	public NumeroInvalidoException(String mensaje, Throwable t) {
		super(mensaje, t);
	}

	public NumeroInvalidoException() {
	}

}
