import java.time.LocalDateTime;

public class ExemploDataHora {
  public static void main(String[] args) {
    /*
     * Para trabalharmos com datas e horas, devemos utilizar a classe
     * LocalDateTime. Esta classe representa uma data e hora, sem timezone.
     * O método estático now() retorna a data e hora atual.
     */
    var dataHoraAtual = LocalDateTime.now();
    System.out.println("Data e hora atual: " + dataHoraAtual); // 2023-06-22T14:02:10

    /*
     * Para criar uma data e hora específica, devemos utilizar o método
     * estático of() da classe LocalDateTime. Este método recebe seis
     * parâmetros: ano, mês, dia, hora, minuto e segundo.
     */
    var dataHoraEspecifica = LocalDateTime.of(2019, 10, 10, 10, 10, 10);
    System.out.println("Data e hora específica: " + dataHoraEspecifica); // 2019-10-10T10:10:10

    /*
     * Podemos realizar manipulações com datas e horas, como por exemplo,
     * adicionar ou subtrair dias, meses, anos, horas, minutos ou segundos.
     * Com os métodos plusDays(), plusMonths(), plusYears(), plusHours(),
     * plusMinutes(), plusSeconds(), minusDays(), minusMonths(), minusYears(),
     * minusHours(), minusMinutes() e minusSeconds().
     */
    var dataHoraAlterada = dataHoraEspecifica.plusDays(10);
    System.out.println("Data e hora alterada: " + dataHoraAlterada); // 2019-10-20T10:10:10
  }
}

