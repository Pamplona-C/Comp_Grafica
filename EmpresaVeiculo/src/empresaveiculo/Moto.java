/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaveiculo;

/**
 *
 * @author pamplona
 */
public class Moto extends Veiculo{
    
    double litrosPorKm;
    
    public Moto(String modelo, int ano, double litrosPorKm){
        super(modelo, ano);
        this.litrosPorKm = litrosPorKm;
    }

    @Override
    double calculaConsumo(double distancia) {
        return litrosPorKm * distancia;
    }
    
}
