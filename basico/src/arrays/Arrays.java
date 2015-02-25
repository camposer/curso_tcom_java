package arrays; 

public class Arrays {
	public static void main(String[] args) {
		int[] numeros = new int[20];
		
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = i * 10;
		
		for (int i : numeros)
			System.out.println(i); // => ?
		
		System.out.println("****************");
		
		String nombres[] = new String[10];
		for (int i = 0; i < nombres.length; i++) {
			nombres[i]  = "hola " + i;
		}
		
		for (String n : nombres) { // for-each
			System.out.println(n);
		}
		
		System.out.println("****************");

		nombres = new String[10];
		for (String n : nombres) { // for-each
			System.out.println("hola " + n);
		}

		System.out.println("****************");
		int[][] otros = new int[4][];
		
		for (int i = 0; i < otros.length; i++) {
			otros[i] = new int[i+1];
			for (int j = 0; j < otros[i].length; j++) {
				otros[i][j] = i * j;
			}
		}

		for (int[] elementoI : otros) {
			for (int valor : elementoI) {
				System.out.println(valor);
			}
		}
	
	
	}
}






