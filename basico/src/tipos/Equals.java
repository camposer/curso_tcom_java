package tipos;

public class Equals {
	public static void main(String[] args) {
		A a1 = new A(1);
		A a2 = new A(1);
		A a3 = a1;
		
		if (a1 == a2)
			System.out.println("Son idénticos");
		else if (a1.equals(a2))
			System.out.println("Son iguales");
		else 
			System.out.println("Son diferentes");

		if (a1 == a3)
			System.out.println("Son idénticos");
		else if (a1.equals(a3))
			System.out.println("Son iguales");
		else 
			System.out.println("Son diferentes");

	}
}

class A {
	public int a;
	
	public A(int a) {
		this.a = a;
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
