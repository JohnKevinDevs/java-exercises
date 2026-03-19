class Conta {
    private double saldo;
    public void depositar(double valor) { this.saldo += valor; }
    public double getSaldo() { return saldo; }
}

public class Ex10 {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(500);
        System.out.println("Saldo atual: R$" + c.getSaldo());
    }
}