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
            System.out.println("Nome inválido!! O nome deve ter no mínimo 4 caracteres.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() == 11){
            this.cpf = cpf;
        }else{
            System.out.println("CPF inválido!! O cpf deve conter 11 dígitos.");
        }
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario >= 0){
            this.salario = salario;
        }else{
            System.out.println("Salário inválido!! O salário deve ser um valor positivo.");
        }
    }
    //Métodos
    public static void cadastrarFuncionario(Funcionario funcionario){
        if(funcionario.salario > 0 && funcionario.cpf.length() == 11 && funcionario.nome.length() >= 4){
            lista_funcionario.add(funcionario);
            System.out.println("Funcionário cadastrado com sucesso!");
            
            return;
        }
        
        System.out.println("Não foi possível cadastrar o funcionário, pois há informações incorretas.");
    }
    
    public static void listarFuncionario(){
        for(Funcionario f : lista_funcionario){
            System.out.println("\nNOME: "+f.getNome()+ "\nCPF: " + f.getCpf() + "\nSALÁRIO: " + f.getSalario());
        }
    }
    
    public static void atualizarFuncionario(String cpf, String novoNome, double novoSalario){
        for(Funcionario f : lista_funcionario){
            if(f.getCpf().equals(cpf)){
                f.setNome(novoNome);
                f.setSalario(novoSalario);
                System.out.println("Funcionário atualizado com sucesso!!");
                
                return;
            }
        }

        System.out.println("Funcionário não encontrado");
    }
    
    public static void excluirFuncionario(String cpf){
        for(Funcionario f : lista_funcionario){
            if(f.getCpf().equals(cpf)){
                lista_funcionario.remove(f);
                System.out.println("Funcionário excluído com sucesso!!");
                
                return;
            }
        }
        
        System.out.println("Funcionário não encontrado.");
    }    
}