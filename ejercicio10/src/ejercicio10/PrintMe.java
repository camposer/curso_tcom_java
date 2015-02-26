package ejercicio10;

public class PrintMe implements Runnable {
	public static final int TIEMPO_SLEEP = 2000; 

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		
			try {
				Thread.sleep(TIEMPO_SLEEP);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
