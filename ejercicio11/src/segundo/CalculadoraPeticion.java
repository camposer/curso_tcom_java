package segundo;

public abstract class CalculadoraPeticion extends CalculadoraProtocolo {
	protected Double op1;
	protected Double op2;
	
	public CalculadoraPeticion(Double op1, Double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}

	public Double getOp1() {
		return op1;
	}

	public void setOp1(Double op1) {
		this.op1 = op1;
	}

	public Double getOp2() {
		return op2;
	}

	public void setOp2(Double op2) {
		this.op2 = op2;
	}
}
