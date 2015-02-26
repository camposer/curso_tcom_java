package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Sockets {
	public static final int PUERTO = 1234;
	public static final String IP = "127.0.0.1";
	
	public static void main(String[] args) {
		new Thread(new Servidor()).start();
		new Thread(new Cliente()).start();
	}
}

class Servidor implements Runnable {
	@SuppressWarnings("resource")
	private void iniciar() throws IOException {
		System.out.println("Servidor iniciado...");

		ServerSocket server = new ServerSocket(Sockets.PUERTO);
		while (true) { // Servidor concurrente
			Socket socket = server.accept(); // llamada bloqueante
			new Sirviente(socket).start(); // Llamada no-bloqueante
		}
	}

	@Override
	public void run() {
		try {
			iniciar();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static class Sirviente extends Thread {
		private Socket socket;
		
		public Sirviente(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			try {
				System.out.println("Servidor conectado");
				
				InputStream entrada = socket.getInputStream();
				Scanner scanner = new Scanner(entrada);
				String nombre = scanner.nextLine(); // => Rodolfo
				System.out.println("Servidor. Recibido, nombre = " + nombre);
				
				OutputStream salida = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(salida);
				String mensaje = "Hola " + nombre;
				pw.println(mensaje);
				pw.flush();
				
				System.out.println("Servidor. Enviado, mensaje = " + mensaje);
				
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class Cliente implements Runnable {
	
	private void iniciar() throws UnknownHostException, IOException {
		Socket socket = new Socket(Sockets.IP, Sockets.PUERTO);
		System.out.println("Cliente conectado");
		
		String nombre = "Pedro";
		
		System.out.println("Cliente. Enviando, nombre = " + nombre);
		OutputStream salida = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(salida);
		pw.println(nombre);
		pw.flush();
		
		InputStream entrada = socket.getInputStream();
		Scanner scanner = new Scanner(entrada);
		System.out.println("Cliente. Recibido, mensaje = " + scanner.nextLine());
		
	}

	@Override
	public void run() {
		try {
			iniciar();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}





