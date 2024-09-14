package exercicio01;

public class Estudante {
    
    protected String nome;
    protected int matricula;
    
    public Estudante(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String toString() {
        return "Estudante: " + this.nome + 
               "\nMatricula: " + this.matricula;
    }
    
}
