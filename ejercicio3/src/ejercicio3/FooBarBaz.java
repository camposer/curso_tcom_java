package ejercicio3;

public class FooBarBaz {
	public static void main(String[] args) {
		for (int i = 1; i <= 3*5*7; i++) {
			String linea = i + ". ";
			linea += (i % 3 == 0)?"foo ":"";
			linea += (i % 5 == 0)?"bar ":"";
			linea += (i % 7 == 0)?"baz ":"";
			
			System.out.println(linea);
		}
	}
}
