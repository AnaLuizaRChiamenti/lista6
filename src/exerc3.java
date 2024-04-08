import java.util.Scanner;

public class exerc3 {
//    2. (ExeSelecao02.java) Construa um programa em Java para ler um valor, verificar se é par
//    ou ímpar e mostrar essa informação. (DICA: Usar if/else e o operador aritmético % para
//    mostrar se valor é par ou ímpar. Ex. (valor % 2 == 0) é par...)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro:");
        int valor = scanner.nextInt();

        if (isPar(valor)) {
            System.out.println("O valor " + valor + " é par.");
        } else {
            System.out.println("O valor " + valor + " é ímpar.");
        }

        scanner.close();
    }

    public static boolean isPar(int num) {
        return num % 2 == 0;
    }
}
