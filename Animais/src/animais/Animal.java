package animais;

/**
 *
 * @author pamplona
 */
public class Animal {
    
    protected String nomeAnimal;
    protected String raca;
    protected String nomeDono;
    
    public Animal(){}
    
    public Animal(String nomeAnimal, String raca, String nomeDono){
        this.nomeAnimal = nomeAnimal;
        this.raca = raca;
        this.nomeDono = nomeDono;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    
    public String toString(){
        return "Animal" +
                "\nNome do animal :" + nomeAnimal +
                "\nRaça : " + raca +
                "\nNome do dono : " + nomeDono + 
                "\n";
    }
    
    public void fazerSom(){
        System.out.println(nomeAnimal + "Faz som");
    }
}
