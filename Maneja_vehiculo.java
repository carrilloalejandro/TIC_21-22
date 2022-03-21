package MiCodigo;

public class Maneja_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehiculo miBarquito;//this is used to create an object inside of
		//the vehiculo class
		Coche miCoche;
		coche_electrico miCochePilas;
		miBarquito=new vehiculo("Titanic2","agua");
		miCoche=new Coche("DeLorian","Terrestre");
		miCochePilas=new coche_electrico("Tesla","terrestre");
		System.out.println("Mi coche es un "+miCochePilas.getId());
	}

}
