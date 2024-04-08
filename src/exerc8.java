import java.util.ArrayList;
import java.util.Scanner;

public class exerc8 {
//    13. (ExeVetor13) Faça um programa que leia dois vetores (A e B) de 30 posições e crie um
//    terceiro (C) com a intersecção dos dois primeiros, isto é, coloque em C apenas os
//    elementos que coexistem em A e B. Mostre C.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = lerVetor("A", 30, scanner);
        int[] B = lerVetor("B", 30, scanner);

        int[] C = intersecao(A, B);

        exibirVetor("C", C);

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

    public static int[] intersecao(int[] A, int[] B) {
        ArrayList<Integer> intersecao = new ArrayList<>();
        for (int num : A) {
            for (int value : B) {
                if (num == value) {
                    intersecao.add(num);
                    break;
                }
            }
        }

        int[] C = new int[intersecao.size()];
        for (int i = 0; i < C.length; i++) {
            C[i] = intersecao.get(i);
        }
        return C;
    }

    public static void exibirVetor(String nome, int[] vetor) {
        System.out.println("Vetor " + nome + ":");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
