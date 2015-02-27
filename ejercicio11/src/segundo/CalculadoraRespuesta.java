package segundo;

public class CalculadoraRespuesta extends CalculadoraProtocolo {
	private Double resultado;

	public CalculadoraRespuesta(Double resultado) {
		this.resultado = resultado;
	}
	
	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
}
