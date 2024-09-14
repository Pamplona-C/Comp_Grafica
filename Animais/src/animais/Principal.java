package animais;

public class Principal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro("Farofa","Pitbull","Leticia",5);
        Animal gato = new Gato("Feijão","split","alemão",2);
        
//        animal.fazerSom();
//        gato.fazerSom();
//        cachorro.fazerSom();
        
        System.out.println(cachorro);
        System.out.println(gato);
    }
    
}
