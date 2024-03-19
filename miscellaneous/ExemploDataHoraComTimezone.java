import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ExemploDataHoraComTimezone {
  public static void main(String[] args) {
    /*
     * Também é possível trabalhar com timezone utilizando a classe
     * ZonedDateTime. Esta classe representa uma data e hora, com timezone.
     * O método estático now() retorna a data e hora atual. O timezone
     * utilizado é o timezone padrão do sistema operacional.
     */
    var dataHoraAtual = ZonedDateTime.now(); // 2023-06-22T14:02:10-03:00[America/Fortaleza]
    System.out.println(dataHoraAtual);

    /*
     * Para criar uma data e hora específica, devemos utilizar o método
     * estático of() da classe ZonedDateTime. Este método recebe sete
     * parâmetros: ano, mês, dia, hora, minuto, segundo e timezone.
     * O timezone deve ser informado utilizando a classe ZoneId.
     */
    var timezone = ZoneId.of("America/Sao_Paulo");
    var dataHoraEspecifica = ZonedDateTime.of(2019, 10, 10, 10, 10, 10, 0, timezone);
    System.out.println(dataHoraEspecifica); // 2019-10-10T10:10:10-03:00[America/Sao_Paulo]

    /*
     * Podemos converter uma data e hora de um timezone para outro utilizando
     * o método withZoneSameInstant().
     */
    var dataHoraAlterada = dataHoraEspecifica.withZoneSameInstant(ZoneId.of("America/New_York"));
    System.out.println(dataHoraAlterada); // 2019-10-10T09:10:10-04:00[America/New_York]

    /*
     * Podemos obter o timezone do sistema utilizando o método estático
     * systemDefault() da classe ZoneId.
     */
    var timezoneSistema = ZoneId.systemDefault();
    System.out.println(timezoneSistema); // America/Fortaleza
  }
}

