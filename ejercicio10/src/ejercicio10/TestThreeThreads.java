package ejercicio10;

public class TestThreeThreads {
	public static void main(String[] args) {
		PrintMe pm = new PrintMe();
		
		new Thread(pm, "Larry").start();
		
		Thread t1 = new Thread(pm);
		t1.setName("Moe");
		t1.start();
		
		new Thread(pm, "Curly").start();

	}
}
