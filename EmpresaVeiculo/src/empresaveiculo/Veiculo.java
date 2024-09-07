package empresaveiculo;
/**
 *
 * @author pamplona
 */
public abstract class Veiculo {
    
    String modelo;
    int ano;
    
    Veiculo(String modelo,int ano){
        this.modelo = modelo;
        this.ano = ano;
    }
    
    void exibirInfo(){
        System.out.println("Modelo: " + modelo+
                            "\nAno : "+ano);
    }
    
    abstract double calculaConsumo(double distancia);
        
    
}
