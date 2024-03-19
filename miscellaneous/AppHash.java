import java.util.HashSet;
import java.util.Set;

public class AppHash {
    public static void main( String[] args ) {
        Set<String> alunos = new HashSet<String>();
        alunos.add("João");
        alunos.add("Maria");
        alunos.add("João"); // Não será adicionado novamente
        System.out.println(alunos); // [João, Maria]
    }
}
