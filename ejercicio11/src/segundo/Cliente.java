package segundo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

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
		return calcular(new Suma(a, b));
	}
	
	public double multiplicar(double a, double b) {
		return calcular(new Multiplicacion(a, b));
	}

	private double calcular(CalculadoraPeticion peticion) {
		double resultado = -1;
		Socket socket = null;
		
		try {
			socket = getSocket();
			
			// Enviando datos al servidor
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(peticion);
			
			// Recibiendo respuesta del servidor
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			CalculadoraRespuesta respuesta = (CalculadoraRespuesta)ois.readObject();
			resultado = respuesta.getResultado();
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
