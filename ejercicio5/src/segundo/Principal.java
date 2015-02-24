package segundo;

public class Principal {
	public static void main(String[] args) {
		SerVivo sv = new Persona();
		
		sv.comer();
		sv.respirar();
		((Persona)sv).caminar();
		((Persona)sv).comer(20);
	} 
}
