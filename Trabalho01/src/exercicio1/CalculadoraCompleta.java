package exercicio1;

/**
 *
 * @author pamplona
 */
public class CalculadoraCompleta extends Calculadora{
    
    CalculadoraCompleta(){}
    
    CalculadoraCompleta(double num1, double num2){
        super(num1,num2);
    }

    public double Raiz(){
        return Math.sqrt(super.getNum1());
    }
    
    public double Potencia(){
        return Math.pow(super.getNum1(), 2);
    }
    
}
