package pacote;

import java.util.ArrayList;

public class Funcionario {
    private static int gerador_id=0;
    private int id;
    private String nome, cpf;
    private double salario;
    
    private static ArrayList<Funcionario> lista_funcionarios = new ArrayList();
    
    public Funcionario(){
        this.nome = "";
        this.cpf = "";
        this.salario = 0;
        this.id  = ++gerador_id;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if(nome.length() >= 4){
            this.nome = nome;
            
            return true;
        }
        
        return false;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        if(cpf.length() == 11){
            this.cpf = cpf;
            return true;
        }
        return false;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public boolean setSalario(double salario){
        if(salario > 0){
            this.salario = salario;
            
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return  "ID= " + id + ", NOME= " + nome + ", CPF= " + cpf + ", SAL�RIO= " + salario ;
    }
    
    
    
    public static boolean cadastrar(Funcionario f){
        if(f.cpf.isEmpty() || f.nome.isEmpty() || f.salario <= 0){
            return false;
        }
        
        for(Funcionario funcionario:lista_funcionarios){
            if(f.cpf.equals(funcionario.cpf)){
                return false;
            }
        }
        
        lista_funcionarios.add(f);
        return true;
    }
    
    public static String mostrar(){
        if(lista_funcionarios.isEmpty()){
            return "N�o h� funcionarios cadastrados...";
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for(Funcionario f:lista_funcionarios){
            resultado.append(f.toString()).append('\n');
        }
        
        return resultado.toString();
    }
    
    public static String editar(Funcionario funcionario){
        if(lista_funcionarios.isEmpty()){
            return "N�o h� funcion�rios cadastrados...";
        }
        
        for(Funcionario f:lista_funcionarios){
            if(f.id == funcionario.id){
                f.nome = funcionario.nome;
                f.cpf = funcionario.cpf;
                f.salario = funcionario.salario;
                
                return f.toString();
            }
        }
        
        return "Funcion�rio n�o encontrado";
    }
    
    public static String excluir(Funcionario funcionario){
        if(lista_funcionarios.isEmpty()){
            return "N�o h� funcion�rios cadastrados...";
        }
        
        for(Funcionario f: lista_funcionarios){
            if(f.id == funcionario.id){
                lista_funcionarios.remove(f);
                
                return "Funcion�rio removido com sucesso!!";
            }    
        }
        
        return "Funcion�rio n�o encontrado...";
    }
}
