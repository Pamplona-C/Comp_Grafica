package exercicio01;

public class Curso{
    String nomeCurso;
    
    Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    
    public void exibeEstudante(Estudante aluno){
        System.out.println("Curso : " + this.nomeCurso);
        System.out.println(aluno.toString());
    }
}
