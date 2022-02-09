package MiCodigo;

public class Circulo {
	private double radio;
	private ParejaNumeros coordenadasCentro;
	/*private double centro_x;
	private double centro_y;*/
	
	public Circulo(double radio, double centro_x, double centro_y){
		this.setRadio(radio);
		coordenadasCentro=new ParejaNumeros(centro_x, centro_y);
		
	}
	
	double devuelveArea(){
		double area;
		area=(double) (Math.PI*radio*radio);
		return area;
		
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}

}
