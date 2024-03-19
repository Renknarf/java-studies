import java.time.LocalDate;

public class ExemploData {
  public static void main(String[] args) {
    /*
     * Para trabalharmos com datas, devemos utilizar a classe LocalDate.
     * Esta classe representa uma data, sem hora, minuto, segundo, etc.
     * O método estático now() retorna a data atual.
     */
    var dataAtual = LocalDate.now();
    System.out.println("Data atual: " + dataAtual); // 2023-06-22

    /*
     * Para criar uma data específica, devemos utilizar o método estático
     * of() da classe LocalDate. Este método recebe três parâmetros:
     * ano, mês e dia.
     */
    var dataEspecifica = LocalDate.of(2019, 10, 10);
    System.out.println("Data específica: " + dataEspecifica); // 2019-10-10

    /*
     * Podemos realizar manipulações com datas, como por exemplo, adicionar
     * ou subtrair dias, meses ou anos. Com os métodos plusDays(), plusMonths(),
     * plusYears(), minusDays(), minusMonths() e minusYears().
     */
    var dataAlterada = dataEspecifica.plusDays(10);
    System.out.println("Data alterada: " + dataAlterada); // 2019-10-20
  }
}

