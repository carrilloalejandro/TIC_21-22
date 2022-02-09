package MiCodigo;

public class ManejaParejaNumeros {

	public static void main(String[] args) {
		// Voy a vallar el terreno metiendo todos los numeritos que voy a utilizar
		ParejaNumeros misNumeros;
		int num1=3;
		int num2=5;
		misNumeros=new ParejaNumeros(num1, num2);
		
		//Se van a hacer cositas
		System.out.print("La suma de el número ");
		System.out.print(num1);
		System.out.print(" y el número ");
		System.out.print(num2);
		System.out.print(" es igual a ");
		System.out.print(misNumeros.devuelveSuma());
	}

}
