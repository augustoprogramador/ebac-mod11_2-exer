import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String nomesJuntos = "Augusto, Ludimila, Arthur, Eduarda, Lucas";
        String[] nomesSeparados = nomesJuntos.split(",");
        List<String> listaNomes = new ArrayList<String>(Arrays.asList(nomesSeparados));
        System.out.println("Lista ordenada POR ORDEM ALFABÉTICA:");
        // Referências futuras
//        listaNomes.forEach(nome -> {
//            System.out.println(nome);
//        });
        listaNomes.forEach(System.out::println);

        String nomesSexoJuntos = "Augusto - Masculino, Ludimila - Feminino, Arthur - Masculino, Eduarda - Feminino, Lucas - Masculino";
        String[] nomesSexoSeparados = nomesSexoJuntos.split(",");
        Map<String, List<String>> grupoNomesPorSexo = new HashMap<>();
        for (String nomeSexo : nomesSexoSeparados) {
            String[] partes = nomeSexo.split(" - ");
            String nome = partes[0].trim();
            String sexo = partes[1].trim();
            grupoNomesPorSexo.computeIfAbsent(sexo, k -> new ArrayList<>()).add(nome);
        }
        Collections.sort(grupoNomesPorSexo.get("Masculino"));
        Collections.sort(grupoNomesPorSexo.get("Feminino"));
        System.out.println("Nomes MASCULINOS: \n" + grupoNomesPorSexo.get("Masculino"));
        System.out.println("Nomes FEMININOS: \n" + grupoNomesPorSexo.get("Feminino"));
    }
}
