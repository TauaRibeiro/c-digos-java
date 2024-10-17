package pacote;
public class Teste {
    public static void main(String[] args) {
        Funcionario funcionario1  = new Funcionario();
        Funcionario funcionario2  = new Funcionario();
        Funcionario funcionario3  = new Funcionario();
        
        funcionario1.setCpf("05663755594");
        funcionario2.setCpf("05663755524");
        funcionario3.setCpf("05663755514");
        
        funcionario1.setNome("Teste");
        funcionario2.setNome("Teste");
        funcionario3.setNome("Teste");
        
        funcionario1.setSalario(2000);        
        funcionario2.setSalario(2000);        
        funcionario3.setSalario(2000);

        Funcionario.cadastrar(funcionario3);
        Funcionario.cadastrar(funcionario2);
        Funcionario.cadastrar(funcionario1);
        
        System.out.println(Funcionario.mostrar());
    }
    
}
