package enums;

public class Enums {
	public static void main(String[] args) {
		Carta c1 = new Carta(Carta.ESPADAS, 2);
		Carta c2 = new Carta(Carta.BASTOS, 2);
		Carta c3 = new Carta(-1, 2);
		
		CartaEnum ce1 = new CartaEnum(CartaPinta.ESPADAS, 2);
		System.out.println(CartaPinta.ESPADAS); // => ESPADAS
		System.out.println(CartaPinta.ESPADAS.name()); // => ESPADAS
		System.out.println(CartaPinta.ESPADAS.ordinal()); // => 0
		System.out.println(CartaPinta.ESPADAS.getPinta()); // => Spades
	}
}

class Carta {
	public static final int ESPADAS = 0;
	public static final int OROS = 1;
	public static final int BASTOS = 2;
	public static final int COPAS = 3;

	public int pinta;
	public int numero;
	
	public Carta(int pinta, int numero) {
		this.pinta = pinta;
		this.numero = numero;
	}
}

class CartaEnum {
	public CartaPinta pinta;
	public int numero;
	
	public CartaEnum(CartaPinta pinta, int numero) {
		this.pinta = pinta;
		this.numero = numero;
	}
	
}

enum CartaPinta {
	ESPADAS("Spades"), OROS("Golds"), BASTOS("Clubs"), COPAS("Cups"), CUALQUIER_COSA("whatever");
	
	private String pinta;
	
	private CartaPinta(String pinta) {
		this.pinta = pinta;
	}
	
	public String getPinta() {
		return pinta;
	}
}




