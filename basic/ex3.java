public class Ex3 {
    public static void main(String[] args) {
        double peso = 75.5, altura = 1.75;
        double imc = peso / (altura * altura);
        
        System.out.print("Status: ");
        if (imc < 18.5) System.out.println("Abaixo do peso");
        else if (imc < 25) System.out.println("Peso ideal");
        else System.out.println("Sobrepeso");
    }
}