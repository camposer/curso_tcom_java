package hilos;

import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) {
		HolaMundo hm = new HolaMundo();

		for (int i = 0; i < 10; i++)
			new Thread(hm).start();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Terminando hilos");
		hm.terminarHilos();
	}
}

class HolaMundo implements Runnable {
	public int contador = 0;
	public List<String> listaSync = new Vector<String>();
	private boolean terminarHilos = false;

	public void terminarHilos() {
		terminarHilos = true;
	}
	
	@Override
	public void run() { // Este método se ejecuta con el start (de forma
						// asíncrona!!!)
		while (!terminarHilos) {
			imprimirSyncBloque();
			//imprimirSyncMetodo();
			//imprimirAtributoSync();
		}
	}
	
	public void imprimirSyncBloque() {
		synchronized (this) { // bloque sincronizado
			System.out.println("Thread " + Thread.currentThread().getId()
					+ ": Hola Mundo " + contador++);
		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void imprimirSyncMetodo() {
		System.out.println("Thread " + Thread.currentThread().getId()
				+ ": Hola Mundo " + contador++);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void imprimirAtributoSync() {
		listaSync.add("Thread " + Thread.currentThread().getId()
				+ ": Hola Mundo ");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
