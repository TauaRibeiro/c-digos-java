package exemploencapsulamento;

public class ExemploEncapsulamento {
    public static void main(String[] args) {
        //Cadastrando funcionário
        Funcionario f1 = new Funcionario ("Laura Rodrigues", "05544099800", 3500.0);
        Funcionario f2 = new Funcionario ("E", "09883455", -4000);
        
        System.out.println("Tentado colocar um valor negativo em f1:");
        f1.setSalario(-1400);
        
        System.out.println("\nTentando cadastrar f1 e f2: ");
        Funcionario.cadastrarFuncionario(f1);
        Funcionario.cadastrarFuncionario(f2);
        
        
        f2.setCpf("05568700712");
        f2.setNome("Ezequiel Filho");
        f2.setSalario(1800);
        
        System.out.println("\nTentando cadastrar f2 novamente...");
        Funcionario.cadastrarFuncionario(f2);
        
        System.out.println("\nAtualizar funcionário:");
        Funcionario.atualizarFuncionario("05568700712", "Elizabeth Ferreira", 2900);
        Funcionario.atualizarFuncionario("055687012", "Elizabeth Ferreira", 2900);
        
        Funcionario.listarFuncionario();
        
        System.out.println("\nExcluir funcionário:");
        Funcionario.excluirFuncionario("05544099800");
        Funcionario.excluirFuncionario("05544099800");
        
        Funcionario.listarFuncionario();
    }
        
}