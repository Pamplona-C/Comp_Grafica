/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animais;

/**
 *
 * @author pamplona
 */
public class Gato extends Animal{
    
    private int idade;
    
    Gato(String nomeAnimal,String nomeDono,String raca, int idade){
        super(nomeAnimal,nomeDono,raca);
        this.idade = idade;
    }
    
    public void fazerSom(){
        System.out.println(super.nomeAnimal + " Mia");
    }
    
}
