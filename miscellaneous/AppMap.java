import java.util.HashMap;
import java.util.Map;

public class AppMap {
    public static void main( String[] args ) {
        Map<String, String> alunos = new HashMap<String, String>();
        alunos.put("123", "João");
        alunos.put("456", "Maria");
        alunos.put("789", "José");
        System.out.println(alunos); // {123=João, 456=Maria, 789=José}

        alunos.remove("456");
        System.out.println(alunos); // {123=João, 789=José}

        String nome = alunos.get("123");
        System.out.println(nome); // João

    }
}

