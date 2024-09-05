package mensageiro;
/**
 *
 * @author pamplona
 */
public class Mensagem {
   
    void exibir(String mensagem) {
        System.out.println("Mensagem: " + mensagem);
    }

    void exibir(int numero) {
        System.out.println("Numero: " + numero);
    }

    void exibir(int[] numeros) {
        System.out.print("Numeros: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    
}
}
