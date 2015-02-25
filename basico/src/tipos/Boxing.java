package tipos;

public class Boxing {
	public static void main(String[] args) {
		int i1 = 1;
		Integer i2 = 1; // Auto-boxing
		Integer i3 = new Integer(1);
		
		int i4 = new Integer(1); // Auto-unboxing
		int i5 = Integer.parseInt("1");
		String i6 = Integer.toString(1);
		String i7 = 1 + "";
		
		if (i2.equals(i1))
			System.out.println("Son idénticos");
	}
	
}
