package exercicio03;


public class Bicicleta extends Veiculo{
    
    String marca;
    int ano;
    String cor;
    
    public Bicicleta(String modelo, String marca, int ano, String cor){
        super(modelo);
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
    }
    
    @Override
    public String infoVeiculo(){
        return "Veiculo : Bicicleta" + 
                "\n"+super.infoVeiculo()+
                "\nAno : " + this.ano +
                "\nCor : " + this.cor;
    }
    
    @Override
    public String Acelerar(){
        return "Pedalando";
    }
    
    @Override
    public String Frear(){
        return "Freando bicicleta";
    }
}
