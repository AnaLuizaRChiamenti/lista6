import java.util.Scanner;

public class exerc2 {
//    3. (Lista1_03) Construa um programa em Java para ler (via teclado) quatro números do tipo
//    inteiro, calcule e mostre o resultado da média aritmética entre eles. Usar “float” para o tipo
//    de dado da variável que irá armazenar o resultado da média aritmética e imprimir o resultado
//    com duas casas decimais depois da vírgula (%.2f).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quatro números inteiros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        float media = calcularMedia(num1, num2, num3, num4);

        System.out.printf("A média aritmética é: %.2f\n", media);

        scanner.close();
    }

    public static float calcularMedia(int num1, int num2, int num3, int num4) {
        int soma = num1 + num2 + num3 + num4;
        return (float) soma / 4;
    }
}
