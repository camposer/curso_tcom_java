package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializador<T> {
	private String archivo;
	
	public Serializador(String archivo) {
		this.archivo = archivo;
	}
	
	public void serializar(T o) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
		oos.writeObject(o);
		oos.close();
	}
	
	@SuppressWarnings("unchecked")
	public T deserializar() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
		Object resultado = ois.readObject();
		
		ois.close();
		return (T) resultado;
	}
}
