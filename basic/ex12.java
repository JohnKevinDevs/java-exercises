public class Ex12 {
    public static void main(String[] args) {
        int[] v = {5, 2, 8, 1, 3};
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
        System.out.print("Vetor ordenado: ");
        for (int x : v) System.out.print(x + " ");
    }
}