package flujos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializacion {
	public static final String ARCHIVO = "archivos/a.byte";
	
	public static void main(String[] args) throws Exception {
		serializar(new A(1));
		System.out.println(deserializar());
	}

	private static void serializar(A a) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO));
		oos.writeObject(a);
		oos.close();
	}

	private static A deserializar() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO));
		
		A resultado = null;
		Object obj = ois.readObject();
		if (obj instanceof A)
			resultado = (A)obj;
		
		ois.close();
		
		return resultado;
	}
}

class A implements Serializable {
	private static final long serialVersionUID = -1868691207698555876L;
	
	public int a;
	public A(int a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
}