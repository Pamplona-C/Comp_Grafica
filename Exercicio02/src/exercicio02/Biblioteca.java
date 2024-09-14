package exercicio02;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();
    
    public Biblioteca() {
       
    }
    
    public void insertLivro(Livro livro){
        livros.add(livro);
    }
    
    public void ExibeLivros(){
        for(Livro livro : livros){
            System.out.println("Livro: " + livro.getNome() + ", Autor: " + livro.getAutor());
        }
    }
    
    
}
