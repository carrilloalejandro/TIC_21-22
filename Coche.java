package MiCodigo;

public class Coche extends vehiculo {
	private String marca;
	public Coche(String id, String medio) {
		super(id, medio);
		// TODO Auto-generated constructor stub
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
