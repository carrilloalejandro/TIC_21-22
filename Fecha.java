package MiCodigo;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	//Encapsulation it can only be accessed by the method set/get
	
	
	public Fecha(int dia, int mes, int anio) {
		// TODO Auto-generated constructor stub
	}
	public int getDia() {

		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	boolean esPosterior(Fecha nuevaFecha) {
		boolean loEs;
		loEs=false;
		if(this.getAnio()>nuevaFecha.getAnio()) loEs=true;	
		else 
			if(this.getAnio()==nuevaFecha.getAnio())
				if(this.getMes()>nuevaFecha.getMes())
					loEs=true;
				
				else
					if(this.getMes()==nuevaFecha.getMes())
						if(this.getDia()>nuevaFecha.getDia())
							loEs=true;
			
			
		return loEs;
	}
}	







