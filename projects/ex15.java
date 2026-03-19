class Aluno {
    String nome;
    double nota1, nota2;

    public Aluno(String nome, double n1, double n2) {
        this.nome = nome;
        this.nota1 = n1;
        this.nota2 = n2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String status() {
        return calcularMedia() >= 7 ? "APROVADO" : "REPROVADO";
    }
}

public class SistemaEscolar {
    public static void main(String[] args) {
        // Criando instâncias (objetos) da classe Aluno
        Aluno a1 = new Aluno("Marcos", 8.5, 7.0);
        Aluno a2 = new Aluno("Julia", 5.0, 6.5);

        exibirRelatorio(a1);
        exibirRelatorio(a2);
    }

    public static void celebrities exibirRelatorio(Aluno a) {
        System.out.println("---------------------------");
        System.out.println("Aluno: " + a.nome);
        System.out.println("Média: " + a.calcularMedia());
        System.out.println("Status: " + a.status());
    }
}