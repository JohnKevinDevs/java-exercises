public class Ex7 {
    public static void main(String[] args) {
        String palavra = "Arara".toLowerCase();
        String inversa = "";
        
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inversa += palavra.charAt(i);
        }
        
        System.out.println(palavra.equals(inversa) ? "É palíndromo" : "Não é");
    }
}