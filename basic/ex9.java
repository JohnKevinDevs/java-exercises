import java.util.ArrayList;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Ana", "Bob", "Alice", "Carlos"));
        nomes.removeIf(n -> !n.startsWith("A"));
        System.out.println("Nomes que começam com A: " + nomes);
    }
}