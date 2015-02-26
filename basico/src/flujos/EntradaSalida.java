package flujos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class EntradaSalida {
	public static final String DIRECTORIO = "archivos/";
	public static final String ARCHIVO = DIRECTORIO + "foo.txt";
	public static final String IMAGEN = DIRECTORIO + "spain.gif";
	
	public static void main(String[] args) throws Exception {
		leerArchivo1();
		System.out.println("");
		leerArchivo2();
		leerConsola1();
		leerConsola2();
		copiarImagen1();
		copiarImagen2();
	}

	
	private static void copiarImagen2() throws Exception {
		InputStream origen = new FileInputStream(IMAGEN);
		Reader reader = new InputStreamReader(origen);
		BufferedReader br = new BufferedReader(reader);
		
		OutputStream destino = new FileOutputStream(new File(DIRECTORIO + 
				Math.random() + ".gif"));
		Writer writer = new OutputStreamWriter(destino);
		
		
		
		origen.close();
		destino.close();
	}


	private static void copiarImagen1() throws Exception {
		InputStream origen = new FileInputStream(IMAGEN);
		OutputStream destino = new FileOutputStream(new File(DIRECTORIO + 
				Math.random() + ".gif"));

		int b = origen.read();
		while (b != -1) {
			destino.write(b);
			b = origen.read();
		}
		
		origen.close();
		destino.close();
		
	}


	private static void leerArchivo2() throws Exception {
		File archivo = new File(ARCHIVO); // La raíz es el classpath!
		FileInputStream fis = new FileInputStream(archivo);
		
		// 1.- Convertir InputStream a Reader
		Reader r = new InputStreamReader(fis);
		
		// 2.- Envolviendo reader con un bufferedreader
		BufferedReader br = new BufferedReader(r);

		// 3.- Leyendo
		String linea = br.readLine();
		while (linea != null) {
			System.out.println(linea);
			linea = br.readLine();
		}
		
		fis.close();
	}

	private static void leerArchivo1() {
		File archivo = new File(ARCHIVO); // La raíz es el classpath!
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(archivo);
			
			int b = fis.read();
			while (b != -1) {
				System.out.print((char)b);
				b = fis.read();  // siguiente
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

	private static void leerConsola1() throws Exception {
		InputStream is = System.in; // entrada estándar
		
		// 1.- Convertir InputStream a Reader
		Reader r = new InputStreamReader(is);
		
		// 2.- Envolviendo reader con un bufferedreader
		BufferedReader br = new BufferedReader(r);

		// 3.- Leyendo
		System.out.print("Edad? ");
		String edad = br.readLine();
		System.out.println("Entonces me dijiste que tienes " + edad);
	}
	
	@SuppressWarnings("resource")
	private static void leerConsola2() {
		System.out.print("Edad? ");
		Scanner scanner = new Scanner(System.in);
		String edad = scanner.nextLine();
		System.out.println("Entonces me dijiste que tienes " + edad);
	}
	
}



