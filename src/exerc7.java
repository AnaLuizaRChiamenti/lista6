import java.util.Scanner;

public class exerc7 {
//(ExeVetor07) Ler um vetor X de 10 elementos (ler pelo teclado os 10 elementos do tipo
//    inteiro). Crie um vetor Y da seguinte forma: (a) os elementos de ordem par de Y (elementos
//    com índice 0, 2, 4, 6, 8) receberão os respectivos elementos de X multiplicados por 2; (b)
//    Os elementos de ordem ímpar de Y (elementos com índices 1, 3, 5, 7, 9) receberão os
//    respectivos elementos de X multiplicados por 3. Escrever o vetor Y.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] X = lerVetor("X", 10, scanner);

        int[] Y = criarVetorY(X);

        exibirVetor("Y", Y);

        scanner.close();
    }

    public static int[] lerVetor(String nome, int tamanho, Scanner scanner) {
        System.out.println("Digite os elementos do vetor " + nome + ":");
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }
        return vetor;
    }

    public static int[] criarVetorY(int[] X) {
        int[] Y = new int[10];
        for (int i = 0; i < X.length; i++) {
            if (i % 2 == 0) {
                Y[i] = X[i] * 2;
            } else {
                Y[i] = X[i] * 3;
            }
        }
        return Y;
    }

    public static void exibirVetor(String nome, int[] vetor) {
        System.out.println("Vetor " + nome + ":");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

