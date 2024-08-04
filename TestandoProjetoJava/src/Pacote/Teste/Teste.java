package Pacote.Teste;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double numero1, numero2;

        System.out.print("Digite um número: ");
        numero1 = input.nextDouble();

        System.out.print("Digite outro número: ");
        numero2 = input.nextDouble();

        System.out.printf("A soma entre eles será %.2f", numero1+numero2);
    }
}
