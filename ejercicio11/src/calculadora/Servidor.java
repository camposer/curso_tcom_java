package calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static final int PUERTO = 1234;
	
	private boolean finalizado = false;
	
	public static void main(String[] args) throws Exception {
		new Servidor().iniciar();
	}
	
	@SuppressWarnings("resource")
	public void iniciar() throws IOException {
		ServerSocket server = new ServerSocket(PUERTO); 
		System.out.println("Servidor iniciado...");
		while (!finalizado) {
			Socket socket = server.accept(); // Establece comunicación con el cliente
			new Sirviente(socket).start();
		}
	}
	
	public static class Sirviente extends Thread {
		private Socket socket;
		private Calculadora calc;
		
		public Sirviente(Socket socket) {
			this.socket = socket;
			this.calc = new Calculadora();
		}
		
		@SuppressWarnings("resource")
		@Override
		public void run() {
			try {
				// Leyendo datos del cliente
				Scanner scanner = new Scanner(socket.getInputStream());
				String operacion = scanner.nextLine();
				Double op1 = Double.parseDouble(scanner.nextLine());
				Double op2 = Double.parseDouble(scanner.nextLine());
				
				// Cálculo
				Double resultado = null;
				if (operacion.equals(Calculadora.SUMAR))
					resultado = calc.sumar(op1, op2);
				else if (operacion.equals(Calculadora.RESTAR))
					resultado = calc.restar(op1, op2);
				else if (operacion.equals(Calculadora.MULTIPLICAR))
					resultado = calc.multiplicar(op1, op2);
				else if (operacion.equals(Calculadora.DIVIDIR))
					resultado = calc.dividir(op1, op2);
					
				// Escribiendo la respuesta
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println(resultado);
				pw.flush(); // Escribe en el socket
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void finalizar() {
		finalizado = true;
	}
}

