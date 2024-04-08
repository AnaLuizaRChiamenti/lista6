import java.util.Scanner;

public class exerc6 {
//(ExeVetor05) Escreva um programa que leia dois vetores (A e B) de 10 posições e faça a
//    multiplicação dos elementos de mesmo índice em ambos os vetores colocando o resultado
//    em um terceiro vetor (C). Mostre o vetor resultante.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 10; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            C[i] = A[i] * B[i];
        }

        System.out.println("Vetor resultante C:");
        for (int num : C) {
            System.out.print(num + " ");
        }

    }
}

