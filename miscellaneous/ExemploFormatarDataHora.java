import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExemploFormatarDataHora {
  public static void main(String[] args) {
    /*
     * Também é possível formatar a data e hora de acordo com o padrão
     * informado, utilizando a classe DateTimeFormatter. Esta classe possui um método
     * estático para formatar a data e hora.
     * Primeiro, devemos criar um objeto da classe DateTimeFormatter
     * informando o padrão que desejamos utilizar para formatar a data e hora.
     */
    var formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    /*
     * Depois, devemos utilizar o método format() da classe DateTimeFormatter
     * para formatar a data e hora. Este método recebe um objeto da classe
     * LocalDateTime ou LocalDate ou LocalTime e retorna uma String com a data
     * e hora formatada.
     */
    var dataHora = LocalDateTime.of(2019, 10, 10, 10, 10, 10);
    var dataHoraFormatada = formatador.format(dataHora);
    System.out.println("Data e hora formatada: " + dataHoraFormatada); // 10/10/2019 10:10:10
  }
}

