package segundo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import calculadora.Calculadora;

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
		
		@Override
		public void run() {
			try {
				// Leyendo datos del cliente
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				CalculadoraPeticion peticion = (CalculadoraPeticion)ois.readObject();

				// Cálculo
				Double resultado = null;
				if (peticion instanceof Suma)
					resultado = calc.sumar(peticion.getOp1(), peticion.getOp2());
				else if (peticion instanceof Resta)
					resultado = calc.restar(peticion.getOp1(), peticion.getOp2());
				else if (peticion instanceof Multiplicacion)
					resultado = calc.multiplicar(peticion.getOp1(), peticion.getOp2());
				else if (peticion instanceof Division)
					resultado = calc.dividir(peticion.getOp1(), peticion.getOp2());
					
				// Escribiendo la respuesta
				CalculadoraRespuesta respuesta = 
						new CalculadoraRespuesta(resultado);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(respuesta);
			} catch (Exception e) {
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

