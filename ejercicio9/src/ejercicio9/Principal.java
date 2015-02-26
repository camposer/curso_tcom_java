package ejercicio9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import util.Serializador;
import dto.Persona;

public class Principal {
	public static final String ARCHIVO = "archivos/Persona.byte";
	private Scanner scanner;
	
	public Principal() {
		scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		new Principal().iniciar();
	}
	
	public void iniciar() {
		// 1.- Pidiendo datos de persona
		System.out.print("Nombre? ");
		String nombre = scanner.nextLine();
		
		System.out.print("Edad? ");
		int edad = 0;
		try {
			edad = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.err.println("Edad inválida " + e.getMessage());
		}

		System.out.print("Altura? ");
		float altura = 0f;
		try {
			altura = Float.parseFloat(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.err.println("Altura inválida " + e.getMessage());
		}
		
		// 2.- Construyendo la persona
		Persona p = new Persona(nombre, altura, edad);
		
		// 3 y 4.- Serializando y deserializando el objeto
		Serializador<Persona> ser = new Serializador<Persona>(ARCHIVO);
		try {
			ser.serializar(p);
			
			p = ser.deserializar();
			System.out.println(p);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
