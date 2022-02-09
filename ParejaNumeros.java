package MiCodigo; 

  

public class ParejaNumeros { 

	//Aquí van los atributos 

	private double num1; 
	private double num2; 

	//El constructor 

	public ParejaNumeros(double num1, double num2) { 
		this.num1=num1; 
		this.num2=num2; 

} /*
	double getNum1() {
		return(num1);
	}
*/

//Resto de métodos 

	public double devuelveSuma() { 
		return(num1+num2);

} 

	public double devuelveResta() {
		return(num1-num2);
}

	public double devuelveDivision() {
		double division;
		division=num1/num2;
		return(division);
}

	/**
	 * @return the num1
	 */
	public double getNum1() {
		return num1;
	}
	
	//Metodos getters y setters

	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public double getNum2() {
		return num2;
	}

	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(double num2) {
		this.num2 = num2;
	}
  

} 
