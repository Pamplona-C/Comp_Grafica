package exercicio5;

/**
 *
 * @author pamplona
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class EntradaDeCinema {

    private LocalDate dataFilme;
    private LocalTime horario;
    private int sala;
    private double valor;

    
    public EntradaDeCinema(LocalDate dataFilme, LocalTime horario, int sala, double valor) {
        this.dataFilme = dataFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }


    public double calculaDesconto(LocalDate dataNascimento) {
        long idade = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
        if (idade < 12) {
            return valor * 0.50; // 50% de desconto
        }
        return valor;
    }

  
    public double calculaDesconto(LocalDate dataNascimento, int carteiraEstudante) {
        long idade = ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());

        if (idade >= 12 && idade <= 15) {
            return valor * 0.60; // 40% de desconto
        } else if (idade >= 16 && idade <= 20) {
            return valor * 0.70; // 30% de desconto
        } else if (idade > 20) {
            return valor * 0.80; // 20% de desconto
        }
        return valor;
    }

    
    public double calculaDescontoHorario(double valorComDesconto) {
        if (horario.isBefore(LocalTime.of(16, 0))) {
            return valorComDesconto * 0.90; 
        }
        return valorComDesconto;
    }

    
    @Override
    public String toString() {
        return "Entrada de Cinema\n" +
               "Data do filme: " + dataFilme + "\n" +
               "Horário: " + horario + "\n" +
               "Sala: " + sala + "\n" +
               "Valor: R$ " + valor;
    }
    
}