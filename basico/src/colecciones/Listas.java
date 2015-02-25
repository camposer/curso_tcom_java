package colecciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add(1);
		lista.add("uno");
		lista.add("dos");
		lista.add("dos");
		lista.add(new Date());
		lista.add(new A(1));
		lista.add(new A(1));
		
		System.out.println(lista); // => [1, uno, dos, dos, Wed Feb 25 15:35:40 CET 2015, A [a=1], A [a=1]]
		
		for (Object obj : lista) 
			System.out.println(obj);

		System.out.println("****************");
		for (int i = 0; i < lista.size(); i++) 
			System.out.println(lista.get(i));

		System.out.println("****************");
		Iterator iter = lista.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}
}
