package empresaveiculo;

import java.util.ArrayList;

/**
 *
 * @author pamplona
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        
        veiculos.add(new Carro("Argo",2019,6));
        veiculos.add(new Moto("Titan",2011,25));
        
        double distancia = 100;
        
        for(Veiculo veiculo : veiculos){
            veiculo.exibirInfo();
            System.out.println("Consumo para "+distancia+" Km "
                                + veiculo.calculaConsumo(distancia) + " litros\n");
        }
    }
    
}
