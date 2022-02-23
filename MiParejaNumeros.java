package MiCodigo;
public class MiParejaNumeros {
    //Attributes->variables
    int num1;
    int num2;
    //Constructor
    public MiParejaNumeros(int num1,int num2){
            this.num1=num1;
            this.num2=num2;
           
    }
   
    //Methods->functions
    //Methods set/get
    void setNum1(int num1){
            this.num1=num1;
    }
    void setNum2(int num2) {
            this.num2=num2;
    }
    int getNum1() {
            return num1;
    }
    int getNum2() {
            return num2;
    }
   
    int devuelveSuma() {
            int sumaNumeros;
            sumaNumeros=num1+num2;
            return(sumaNumeros);
    }

}