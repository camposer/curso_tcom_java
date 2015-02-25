package tipos;

public class Strings {
	public static void main(String[] args) {
		String nombre1 = "Juan";
		String nombre2 = "Juan";

		if (nombre1 == nombre2)
			System.out.println("Son idénticos");
		else if (nombre1.equals(nombre1))
			System.out.println("Son iguales");
		else
			System.out.println("Sin diferentes");

		//
		nombre1 = new String("Juan");
		nombre2 = new String("Juan");

		if (nombre1 == nombre2)
			System.out.println("Son idénticos");
		else if (nombre1.equals(nombre1))
			System.out.println("Son iguales");
		else
			System.out.println("Sin diferentes");
	
	}
}
