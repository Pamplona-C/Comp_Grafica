package exercicio03;

public abstract class Veiculo {
    
    String modelo;
    
    Veiculo(String modelo){
        this.modelo = modelo;
    }
    
    public String infoVeiculo(){
        return "Modelo : " + this.modelo;
    }
    
    abstract String Acelerar();
    abstract String Frear();
}
