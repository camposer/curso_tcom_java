
public class EstructurasControl {
	public static void main(String[] args) {
		pruebasFor();
		pruebasWhile();
	}

	private static void pruebasWhile() {
		int i = 0;
		while (i < 10) {
			System.out.println("i = " + i);
			i++;
		}
		
		while (true) {
			System.out.println("i = " + i++);
			if (i > 10)
				break;
		}
		
		i = 0;
		do {
			System.out.println("i = " + i++);
			if (i > 10)
				break;
		} while (true);
		
	}

	private static void pruebasFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; ) {
			System.out.println("i = " + ++i);
		}
		
		System.out.println();
		
		for (int i = 0;;) {
			System.out.println("i = " + i++);
			if (i > 10)
				break;
			
		}
		
		int i = 0;
		for (;;) {
			System.out.println("i = " + i++);
			if (i > 10)
				break;
			
		}

		System.out.println();
		i = 0;
		for (;true;) {
			if (i++ < 3)
				continue;
			
			System.out.println("i = " + i);
			
			if (i > 10)
				break;
			
		}

	}
}
