import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        List<String> alunos = new ArrayList<String>();
        alunos.add("João");
        alunos.add("Maria");
        alunos.add("José");
        System.out.println(alunos); // [João, Maria, José]

        alunos.remove("Maria");
        System.out.println(alunos); // [João, José]

        String aluno = alunos.get(0);
        System.out.println(aluno); // João
    }
}
