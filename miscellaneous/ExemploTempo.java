import java.time.LocalTime;

public class ExemploTempo {
  public static void main(String[] args) {
    /*
     * Para trabalharmos com horas, devemos utilizar a classe LocalTime.
     * Esta classe representa uma hora, sem data, mês, ano, etc.
     * O método estático now() retorna a hora atual.
     */
    var horaAtual = LocalTime.now();
    System.out.println("Hora atual: " + horaAtual); // 14:02:10

    /*
     * Para criar uma hora específica, devemos utilizar o método estático
     * of() da classe LocalTime. Este método recebe três parâmetros:
     * hora, minuto e segundo.
     */
    var horaEspecifica = LocalTime.of(10, 10, 10);
    System.out.println("Hora específica: " + horaEspecifica); // 10:10:10

    /*
     * Podemos realizar manipulações com horas, como por exemplo, adicionar
     * ou subtrair horas, minutos ou segundos. Com os métodos plusHours(),
     * plusMinutes(), plusSeconds(), minusHours(), minusMinutes() e
     * minusSeconds().
     */
    var horaAlterada = horaEspecifica.plusHours(10);
    System.out.println("Hora alterada: " + horaAlterada); // 20:10:10
  }
}
