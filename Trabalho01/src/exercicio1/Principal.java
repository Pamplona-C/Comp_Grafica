package exercicio1;

import exercicio4.CadernoDeEnderecos;
import exercicio2.Notas;
import exercicio3.Data;
import exercicio5.EntradaDeCinema;
import java.time.LocalDate;
import java.time.LocalTime;
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
        EntradaDeCinema ingresso = new EntradaDeCinema(
                LocalDate.of(2024, 8, 27), 
                LocalTime.of(14, 30), 
                5, 
                50.0);
        
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
        System.out.println("\n");
        
        //Exercício 05
        System.out.println("Exercício 05");
        //aplicando desconto para criança
        double valorComDesconto = ingresso.calculaDesconto(LocalDate.of(2014, 8, 10));
        System.out.println("Valor com desconto para criança: R$ " + valorComDesconto);

        // Calculando o desconto para um estudante de 18 anos
        valorComDesconto = ingresso.calculaDesconto(LocalDate.of(2006, 8, 10), 12345);
        System.out.println("Valor com desconto para estudante de 18 anos: R$ " + valorComDesconto);

        // Aplicando desconto para o horário
        double valorFinal = ingresso.calculaDescontoHorario(valorComDesconto);
        System.out.println("Valor final com desconto de horário: R$ " + valorFinal);

        // Exibindo ingresso
        System.out.println(ingresso.toString());
    }
    
}
