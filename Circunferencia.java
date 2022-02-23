package MiCodigo;

public class Circunferencia {
	private MiParejaNumeros centroCirculo;
	private double radio;
	double area;
	double perimeter;
	public Circunferencia(int coordX, int coordY, double radio) {
		super();
		centroCirculo=new MiParejaNumeros(coordX,coordY);
		this.radio = radio;
		
	}
	public int getCoordX() {
		return(centroCirculo.getNum1());
	}
	public void setCoordX(int coordX) {
		centroCirculo.setNum1(coordX);
	}
	public int getCoordY() {
		return (centroCirculo.getNum2());
	}
	public void setCoordY(int coordY) {
		centroCirculo.setNum2(coordY);
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	public double getArea() {
		double area;
		area=Math.PI*Math.pow(radio,2);
		return area;
	}
	public double getPerimeter() {
		double perimeter;
		perimeter=Math.PI*2*radio;
		return perimeter;
	}
	
	
}