package exercicio03;

public class Carro extends Veiculo{
    
    int ano;
    String cor;

    public Carro(String modelo, int ano, String cor) {
        super(modelo);
        this.ano = ano;
        this.cor = cor;
    }
    
    @Override
    public String infoVeiculo(){
        return "Veiculo : Carro" + 
                "\n"+super.infoVeiculo()+
                "\nAno : " + this.ano +
                "\nCor : " + this.cor;
    }
    

    @Override
    public String Acelerar() {
        return "Acelerando";   
    }

    @Override
    public String Frear() {
       return "Freando";
    }
    
    
}
