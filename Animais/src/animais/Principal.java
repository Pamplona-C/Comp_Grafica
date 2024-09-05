/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animais;

/**
 *
 * @author pamplona
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal = new Animal("Mila","Pincher","Bruno");
        Cachorro cachorro = new Cachorro("Farofa","Pitbull","Leticia",5);
        Animal gato = new Gato("Feijão","split","alemão",2);
        
//        animal.fazerSom();
//        gato.fazerSom();
//        cachorro.fazerSom();
        
        System.out.println(cachorro);
        System.out.println(gato);
    }
    
}
