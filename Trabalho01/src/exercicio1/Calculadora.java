package exercicio1;

/**
 *
 * @author pamplona
 */
public class Calculadora {
    private double num1, num2;
    
    Calculadora(){}
    
    Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
   
    public double Soma(){
        return(this.num1 + this.num2);
    }
    
    public double Sub(){
        return(this.num1 - this.num2);
    }
    
    public double multiplica(){
        return this.num1 * this.num2;
    }
    
    public double divide(){
        if (this.num2 == 0) {
            throw new ArithmeticException("Divisão por zero não permitida.");
        }
        return this.num1 / this.num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
    
}
