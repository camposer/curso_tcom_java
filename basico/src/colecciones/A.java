package colecciones;

public class A {
	public int a;
	public A(int a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
	
}
