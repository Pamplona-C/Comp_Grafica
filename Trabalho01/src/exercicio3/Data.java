package exercicio3;

/**
 *
 * @author pamplona
 */
public class Data {
    int dia;
    int mes;
    int ano;
    

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data\n"+
               String.format("%02d/%02d/%04d",this.dia,this.mes,this.ano);
                
    }
    
    
}
