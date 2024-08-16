/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequencia.pkg3;

/**
 *
 * @author aluno
 */
public class Sequencia3 {

    public static void main(String[] args) {
        for(int j = 1; j <= 2; j++){
            for(int i = 1; i <= 4; i++){
                System.out.print(j!=2 || i!=4 ? i+", ": i);
            }
        }
    }
    
}
