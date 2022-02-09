package MiCodigo;

public class ManejaCirculo {

	public static void main(String[] args) {
		Circulo miCirculito;
		miCirculito=new Circulo(10.0,3.0,4.0);
		System.out.print("El circulo de raido ");
		System.out.println(miCirculito.radio);
		System.out.print("Area del circulo es: ");
		System.out.println(miCirculito.devuelveArea()); 
		System.out.println(miCirculito.coordenadasCentro.getNum1());
		
	}

}
