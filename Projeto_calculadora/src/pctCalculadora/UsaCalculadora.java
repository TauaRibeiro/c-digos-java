package pctCalculadora;
import java.util.Scanner;

public class UsaCalculadora {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        
        double numero1, numero2;
        
        System.out.println("Digite o 1° número: ");
        numero1 = entrada.nextDouble();
        
        System.out.println("Digite o 2° número: ");
        numero2 = entrada.nextDouble();
                
        System.out.println(calculadora.somar(numero1, numero2));
        System.out.println(calculadora.subtrair(numero1, numero2));
        System.out.println(calculadora.multiplicar(numero1, numero2));
        calculadora.dividir(numero1, numero2);
    }
    
}
