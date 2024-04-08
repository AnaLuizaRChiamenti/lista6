import java.util.Arrays;

public class exerc5 {
//    (ExeVetor03) Preencher um vetor B de 10 elementos em tempo de execução com o
//    número 10 se o índice do elemento for ímpar, e com o número 20 se for par. Escrever o
//    vetor B após o seu total preenchimento.

    public static void main(String[] args) {
        int[] B = new int[10];

        preencherVetor(B);

        System.out.println("Vetor B após o preenchimento:");
        System.out.println(Arrays.toString(B));
    }
    public static void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = 20;
            } else {
                vetor[i] = 10;
            }
        }
    }
}
