package MiCodigo;

public class coche_electrico extends Coche {
	private Double potencia_bateria;
	public coche_electrico(String id, String medio) {
		super(id, medio);
		// TODO Auto-generated constructor stub
	}
	public Double getPotencia_bateria() {
		return potencia_bateria;
	}
	public void setPotencia_bateria(Double potencia_bateria) {
		this.potencia_bateria = potencia_bateria;
	}

}
