package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ordenacion {
	public static void main(String[] args) {
		Set<Estudiante> estudiantes = new TreeSet<Estudiante>();
		estudiantes.add(new Estudiante(1, 8, 20));
		estudiantes.add(new Estudiante(2, 6, 21));
		estudiantes.add(new Estudiante(3, 9, 19));

		imprimir(estudiantes);
		
		// 1.- Convirtiendo set a lista
		List<Estudiante> listaEstudiantes = 
				new ArrayList<Estudiante>(estudiantes);
		
		// 2.- Ordenando por notas 
		Collections.sort(listaEstudiantes, new EstudianteNotaAsc());
		imprimir(listaEstudiantes);

		// 3.- Ordenando por edades (clase anónima)
		Collections.sort(listaEstudiantes, new Comparator<Estudiante>() {
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o1.edad - o2.edad;
			}
		});
		imprimir(listaEstudiantes);

		// 4.- Ordenando por edades (clase anónima)
		Comparator<Estudiante> comparator = new Comparator<Estudiante>() {
			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				return o1.edad - o2.edad;
			}
		};
		Collections.sort(listaEstudiantes, comparator);
		imprimir(listaEstudiantes);
	
		// 5.- Ordenando por edades (clase interna - inner-class)
		Collections.sort(listaEstudiantes, new EstudianteComparator());
		imprimir(listaEstudiantes);
	}
	
	public static void imprimir(Collection<Estudiante> estudiantes) {
		System.out.println();
		for (Estudiante e : estudiantes) 
			System.out.println(e);
		
	}
	
	static class EstudianteComparator implements Comparator<Estudiante> {
		@Override
		public int compare(Estudiante o1, Estudiante o2) {
			return o1.edad - o2.edad;
		}
	}

}

class EstudianteNotaAsc implements Comparator<Estudiante> {
	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		return (int)Math.ceil(o2.nota - o1.nota);
	}
}

class Estudiante implements Comparable<Estudiante> {
	public int id;
	public float nota;
	public int edad;
	
	public Estudiante(int id, float nota, int edad) {
		this.id = id;
		this.nota = nota;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nota=" + nota + ", edad=" + edad
				+ "]";
	}

	@Override
	public int compareTo(Estudiante viejo) {
		Estudiante nuevo = this;
		return  viejo.id - nuevo.id;
	}
	
	
}
