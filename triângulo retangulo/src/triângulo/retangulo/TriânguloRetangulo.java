package triângulo.retangulo;

import java.util.Scanner;
        
public class TriânguloRetangulo {

    public static void main(String[] args) {
        int altura, limite;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a altura: ");
        altura = input.nextInt();
        
        limite = 1;
        
        for(int y = 0; y < altura; y++){
            for(int x = 0; x < limite; x++){
                System.out.print('*');
            }
            
            limite++;
                    
            System.out.print('\n');
        }
    }
    
}
