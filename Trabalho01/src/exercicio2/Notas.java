package exercicio2;

/**
 *
 * @author pamplona
 */
public class Notas {
    
    protected double trabalho1, trabalho2, trabalho3, trabalho4;
    protected double prova1, prova2;
    protected double media;
    
    public Notas(){}

    public Notas(double trabalho1, 
            double trabalho2, 
            double trabalho3, 
            double trabalho4, 
            double prova1, 
            double prova2) {
        this.trabalho1 = trabalho1;
        this.trabalho2 = trabalho2;
        this.trabalho3 = trabalho3;
        this.trabalho4 = trabalho4;
        this.prova1 = prova1;
        this.prova2 = prova2;
    }
    
    public double Media(){
        double mediaParcial1 = (this.trabalho1 + this.trabalho2 + this.prova1) / 3;
        double mediaParcial2 = (this.trabalho3 + this.trabalho4 + this.prova2) / 3;
        return (mediaParcial1 + mediaParcial2) / 2;
    }

    public double getTrabalho1() {
        return trabalho1;
    }

    public void setTrabalho1(double trabalho1) {
        this.trabalho1 = trabalho1;
    }

    public double getTrabalho2() {
        return trabalho2;
    }

    public void setTrabalho2(double trabalho2) {
        this.trabalho2 = trabalho2;
    }

    public double getTrabalho3() {
        return trabalho3;
    }

    public void setTrabalho3(double trabalho3) {
        this.trabalho3 = trabalho3;
    }

    public double getTrabalho4() {
        return trabalho4;
    }

    public void setTrabalho4(double trabalho4) {
        this.trabalho4 = trabalho4;
    }
    
    public String toString(){
        return "Notas \n" +
                "Trabalho1 : "+this.trabalho1+
                "\nTrabalho2 : "+this.trabalho2+
                "\nTrabalho3 : "+this.trabalho3+
                "\nTrabalho4 : "+this.trabalho4+
                "\nProva1 : " +this.prova1+
                "\nProva2 : "+this.prova2+
                "\n";
    }
    
}
