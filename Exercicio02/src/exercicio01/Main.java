package exercicio01;

import exercicio02.Biblioteca;
import exercicio02.Livro;
import exercicio03.Bicicleta;
import exercicio03.Carro;
import exercicio03.Veiculo;

public class Main {

    public static void main(String[] args) {
        
        /*Exercicio 01*/
        System.out.println("Exercicio 01\n");
        Curso curso = new Curso("Matematica");
        Estudante aluno = new Estudante("Matheus",202100887);
        
        curso.exibeEstudante(aluno);
        System.out.println("\n");
        
        /*Exercçício 02*/
        System.out.println("Exercicio 02");
        Biblioteca biblioteca = new Biblioteca();
        Livro livro01 = new Livro("Viagem ao centro da terra","Júlio verne");
        
        biblioteca.insertLivro(livro01);
        biblioteca.ExibeLivros();
        
        /* Exercicio 03*/
        System.out.println("\nExercicio 03");
        Carro carro = new Carro("Duster",2011,"Prata");
        System.out.println(carro.infoVeiculo());
        System.out.println(carro.Acelerar());
        
        Bicicleta bicicleta = new Bicicleta("cross","bmx",2010,"vermelha");
        System.out.println(bicicleta.infoVeiculo());
        System.out.println(bicicleta.Acelerar());
        
        
    }
    
}
