package MiCodigo;

public class ManejaNumeros {
	
	public static void main(String[] args) {
		int suma;
		int suma2;
		MiParejaNumeros objeto1;//I declare the object
		objeto1=new MiParejaNumeros(5,8);//Instance
		MiParejaNumeros objeto2;//I declare the object
		objeto2=new MiParejaNumeros(1,4);//Instance
		objeto1.setNum1(6);
		objeto2.setNum2(4);
		suma=objeto1.devuelveSuma();
		objeto2.setNum1(4);
		objeto2.setNum1(2);
		suma2=objeto2.devuelveSuma();
		System.out.println("La suma de la pareja 1: ");
		System.out.println(suma);
		System.out.println("La suma de la pareja 2: ");
		System.out.println(suma2);
	}
	 
}
