package colecciones;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {
	public static void main(String[] args) {
		setConObjetos();
		setConGenericos();
	}

	private static void setConGenericos() {
		Set<String> set = new HashSet<String>();
		set.add("uno");
		set.add("dos");
		set.add("dos");
		
		System.out.println(set); // => [1, uno, dos, Wed Feb 25 15:35:40 CET 2015, A [a=1]]
		
		for (String str : set)
			System.out.println(str);
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void setConObjetos() {
		Set set = new HashSet();
		set.add(1);
		set.add("uno");
		set.add("dos");
		set.add("dos");
		set.add(new Date());
		set.add(new A(1));
		set.add(new A(1));
		
		System.out.println(set); // => [1, uno, dos, Wed Feb 25 15:35:40 CET 2015, A [a=1]]
		
		for (Object obj : set)
			System.out.println(obj);
		
		Iterator iter = set.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}
}







