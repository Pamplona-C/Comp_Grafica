package exercicio1;

import exercicio4.CadernoDeEnderecos;
import exercicio2.Notas;
import exercicio3.Data;
/**
 *
 * @author pamplona
 */
public class Principal {
    public static void main(String[] args) {
        
        CalculadoraCompleta calculadora = new CalculadoraCompleta(5,5);
        Notas notas = new Notas(10,10,10,10,10,10);
        Data data = new Data(04, 9, 2024);
        CadernoDeEnderecos pessoa = new CadernoDeEnderecos(
            "João da Silva", 
            "(64) 99999-9999", 
            "joao.silva@email.com", 
            "15/08/1995", 
            "Rua das Flores", 
            "Jataí", 
            "GO"
        );
        
        //Exercício 01
        System.out.println("Exercício 01");
        System.out.println(calculadora.Soma());
        System.out.println(calculadora.Sub());
        System.out.println(calculadora.divide());
        System.out.println(calculadora.Raiz());
        System.out.println(calculadora.Potencia());
        System.out.println("\n");
        
        //Exercício 02
        System.out.println("Exercício 02");
        System.out.println(notas);
        double media = notas.Media();
        System.out.println("Media : "+String.format("%.2f", media));
        System.out.println("\n");
        
        //Exercício 03
        System.out.println("Exercício 03");
        System.out.println(data);
        System.out.println("\n");
        
        //Exercício 04
        System.out.println("Exercício 04");
        System.out.println(pessoa);
    }
    
}
