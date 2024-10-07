package exemploencapsulamento;

import java.util.ArrayList;

public class Funcionario {
    //Atributos
    private String nome;
    private String cpf;
    private double salario;
    
    private static ArrayList<Funcionario> lista_funcionario = new ArrayList<>();
    
    //Construtor
    public Funcionario(String nome, String cpf, double salario){
        this.nome=nome;
        this.cpf=cpf;
        
        this.salario=salario;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.length() >= 4){
            this.nome = nome;
        } else{
            System.out.println("Nome inv�lido!! O nome deve ter no m�nimo 4 caracteres.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() == 11){
            this.cpf = cpf;
        }else{
            System.out.println("CPF inv�lido!! O cpf deve conter 11 d�gitos.");
        }
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario >= 0){
            this.salario = salario;
        }else{
            System.out.println("Sal�rio inv�lido!! O sal�rio deve ser um valor positivo.");
        }
    }
    //M�todos
    public static void cadastrarFuncionario(Funcionario funcionario){
        if(funcionario.salario > 0 && funcionario.cpf.length() == 11 && funcionario.nome.length() >= 4){
            lista_funcionario.add(funcionario);
            System.out.println("Funcion�rio cadastrado com sucesso!");
            
            return;
        }
        
        System.out.println("N�o foi poss�vel cadastrar o funcion�rio, pois h� informa��es incorretas.");
    }
    
    public static void listarFuncionario(){
        for(Funcionario f : lista_funcionario){
            System.out.println("\nNOME: "+f.getNome()+ "\nCPF: " + f.getCpf() + "\nSAL�RIO: " + f.getSalario());
        }
    }
    
    public static void atualizarFuncionario(String cpf, String novoNome, double novoSalario){
        for(Funcionario f : lista_funcionario){
            if(f.getCpf().equals(cpf)){
                f.setNome(novoNome);
                f.setSalario(novoSalario);
                System.out.println("Funcion�rio atualizado com sucesso!!");
                
                return;
            }
        }

        System.out.println("Funcion�rio n�o encontrado");
    }
    
    public static void excluirFuncionario(String cpf){
        for(Funcionario f : lista_funcionario){
            if(f.getCpf().equals(cpf)){
                lista_funcionario.remove(f);
                System.out.println("Funcion�rio exclu�do com sucesso!!");
                
                return;
            }
        }
        
        System.out.println("Funcion�rio n�o encontrado.");
    }    
}