import java.util.Scanner;

public class exerc4 {
//    3. (ExeSelecao03.java) Construa um programa em Java para ler dois valores e mostrar o
//    maior deles. (DICA: Usar if/else para mostrar o maior dos valores digitados)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros:");
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        int maior = encontrarMaior(valor1, valor2);

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }

    public static int encontrarMaior(int valor1, int valor2) {
        if (valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }
}
