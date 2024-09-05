package animais;

public class Cachorro extends Animal{
    
    private int idade;
    
    Cachorro(String nomeCachorro, String raca, String nomeDono, int idade){
        super(nomeCachorro, raca, nomeDono);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void fazerSom(){
        System.out.println(super.nomeAnimal + " late");
    }
        
}
