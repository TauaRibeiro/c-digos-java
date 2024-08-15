package exercício.pkg1;

import java.util.Scanner;

public class Exercício1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome, colocacao;
        int idade;
        double nota;
        
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        
        System.out.printf("Digite a colocação de %s: ", nome);
        colocacao = input.nextLine();
        
        System.out.printf("Digite a idade de %s: ", nome);
        idade = input.nextInt();
        
        System.out.printf("Digite a altura de %s: ", nome);
        nota = input.nextDouble();
        
        System.out.printf("%s(%s), %d anos, com nota %.2f!!!\n", nome, colocacao, idade, nota);
        
    }
    
}
