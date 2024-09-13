package cadastroGetSet;

public class Loja {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        
        p1.cadastrarProduto("celular", 1800, 2);
        p2.cadastrarProduto("pc gamer", 7500, 5);
        
        p1.exibirProduto();
        p2.exibirProduto();
    }
    
}
