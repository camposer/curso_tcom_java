package calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static final String IP = "127.0.0.1";
	public static final int PUERTO = 1234;
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		System.out.println("2 + 3 = " + cliente.sumar(2, 3));
		System.out.println("2 * 3 = " + cliente.multiplicar(2, 3));
	}
	
	public Socket getSocket() throws UnknownHostException, IOException {
		return new Socket(IP, PUERTO);
	}
	
	public double sumar(double a, double b) {
		return calcular(a, b, "sumar");
	}
	
	public double multiplicar(double a, double b) {
		return calcular(a, b, "multiplicar");
	}

	@SuppressWarnings("resource")
	private double calcular(double a, double b, String operacion) {
		double resultado = -1;
		Socket socket = null;
		
		try {
			socket = getSocket();
			
			// Enviando datos al servidor
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println(operacion);
			pw.println(a);
			pw.println(b);
			pw.flush();
			
			// Recibiendo respuesta del servidor
			Scanner scanner = new Scanner(socket.getInputStream());
			resultado = Double.parseDouble(scanner.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return resultado;
	}
}
