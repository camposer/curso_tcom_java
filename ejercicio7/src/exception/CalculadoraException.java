package exception;

@SuppressWarnings("serial")
public abstract class CalculadoraException extends Exception {

	public CalculadoraException() {
		super();
	}
	
	public CalculadoraException(String message) {
		super(message);
	}
}
