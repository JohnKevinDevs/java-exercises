import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n1. Add Tarefa | 2. Listar | 3. Remover | 0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Descrição: ");
                    tarefas.add(sc.nextLine());
                }
                case 2 -> {
                    System.out.println("=== MINHAS TAREFAS ===");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println((i + 1) + ". " + tarefas.get(i));
                    }
                }
                case 3 -> {
                    System.out.print("Número para remover: ");
                    int id = sc.nextInt();
                    if (id > 0 && id <= tarefas.size()) tarefas.remove(id - 1);
                }
            }
        }
    }
}