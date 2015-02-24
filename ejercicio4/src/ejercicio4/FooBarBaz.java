package ejercicio4;

public class FooBarBaz {
	public static void main(String[] args) {
		String[][] valores = new String[3*5*7][3];
		
		for (int i = 0; i < 3*5*7; i++) {
			if ((i + 1) % 3 == 0)
				valores[i][0] = "foo ";
			if ((i + 1) % 5 == 0)
				valores[i][1] = "bar ";
			if ((i + 1) % 7 == 0)
				valores[i][2] = "baz ";
		}
		
		// For tradicional
		for (int i = 0; i < 3*5*7; i++) {
			String linea = (i + 1) + ". ";
			linea += (valores[i][0] != null)?valores[i][0]:"";
			linea += (valores[i][1] != null)?valores[i][1]:"";
			linea += (valores[i][2] != null)?valores[i][2]:"";
			
			System.out.println(linea);
		}

		// For-each
		System.out.println("**********************");
		int i = 1;
		for (String[] fila : valores) {
			String linea = i++ + ". ";
			linea += (fila[0] != null)?fila[0]:"";
			linea += (fila[1] != null)?fila[1]:"";
			linea += (fila[2] != null)?fila[2]:"";
			
			System.out.println(linea);
		}
	
	}
}
