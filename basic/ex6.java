import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        do {
            System.out.print("Digite a senha (1234): ");
            senha = sc.next();
        } while (!senha.equals("1234"));
        System.out.println("Acesso Permitido!");
    }
}