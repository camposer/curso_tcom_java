public class Interfaces {
}

abstract class X {
	public abstract void caminar();
	public void concreto() { }
}
interface I1 {}
interface I2 {}
interface I extends I1, I2 {
	void respirar();
}

abstract class Z extends X implements I {
	public void comer() {
		System.out.println("Soy un método concreto en Z");
	}
}

class H extends Z {
	@Override
	public void respirar() { }
	@Override
	public void caminar() {	}
}


