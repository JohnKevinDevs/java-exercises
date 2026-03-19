import java.util.Scanner;

public class MiniPDV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int item = 1;

        System.out.println("=== SISTEMA DE VENDAS JK ===");
        
        while (true) {
            System.out.print("Preço do item " + item + " (ou 0 para finalizar): ");
            double preco = sc.nextDouble();
            if (preco == 0) break;
            
            total += preco;
            item++;
        }

        if (total > 100) {
            System.out.println("Desconto de 10% aplicado!");
            total *= 0.90;
        }

        System.out.printf("Total a pagar: R$ %.2f\n", total);
        System.out.print("Valor pago pelo cliente: ");
        double pago = sc.nextDouble();
        
        System.out.printf("Troco: R$ %.2f\n", (pago - total));
        System.out.println("Venda Finalizada.");
    }
}