package mensageiro;

public class Principal {

    public static void main(String[] args) {
        Mensagem mensagem = new Mensagem();

        
        mensagem.exibir("Olá, Mundo!"); 
        mensagem.exibir(42); 
        mensagem.exibir(new int[]{1, 2, 3, 4, 5}); 
    }
    
}
