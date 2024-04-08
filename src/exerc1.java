import java.util.Scanner;

public class exerc1 {
//    1. (Lista1_01) Construa programa em Java que leia (via teclado) dois números do tipo inteiro,
//    calcule o produto entre eles e mostre o resultado.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int produto = calcularProduto(num1, num2);

        System.out.println("O produto dos números é: " + produto);

        scanner.close();
    }

    public static int calcularProduto(int num1, int num2) {
        return num1 * num2;
    }
}
