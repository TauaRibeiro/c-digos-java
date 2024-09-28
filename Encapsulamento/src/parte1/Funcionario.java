package parte1;
import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(){
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.println("Digite o nome do funcionário: ");
            
            if(setNome(entrada.nextLine())){
                break;
            }
            
            System.out.println("Nome inválido! O nome deve ter pelo menos 3 caracteres...");
        }
        
        while(true){
            System.out.println("Digite o salário do funcionário: ");
            
            if(setSalario(entrada.nextDouble())){
                break;
            }
            
            System.out.println("Salário inválido! O salário deve ser positivo...");
        }
    }
    
    
    public boolean setNome(String nome) {
        if(nome.length() < 3){
            return false;
        }
        
        this.nome = nome;
        
        return true;
    }

    public boolean setSalario(double salario) {
        if(salario < 0){
            return false;
        }
        this.salario = salario;
        
        return true;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
