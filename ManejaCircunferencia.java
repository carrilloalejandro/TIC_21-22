package MiCodigo;

public class ManejaCircunferencia {
	public static void main(String[]args) {
		Circunferencia circunferencia1;
		circunferencia1=new Circunferencia(7,9,4.5);
		System.out.println("Circulo 1");
		System.out.println("Coordenada X del centro: "+circunferencia1.getCoordX());
		System.out.println("Coordenada Y del centro: "+circunferencia1.getCoordY());
		System.out.println("Radio: "+circunferencia1.getRadio());
		System.out.println("Area: "+circunferencia1.getArea());
		System.out.println("El perimetro del circulo: "+circunferencia1.getPerimeter());
	}

}
