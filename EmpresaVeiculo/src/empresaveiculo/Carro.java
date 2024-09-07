package empresaveiculo;
/**
 *
 * @author pamplona
 */
public class Carro extends Veiculo{
    
    private double litrosPorKm;
    
    Carro(String modelo, int ano, double litrosPorKm){
        super(modelo, ano);
        this.litrosPorKm = litrosPorKm;
    }

    @Override
    double calculaConsumo(double distancia) {
        return distancia * litrosPorKm;
    }
    
    
    
}
