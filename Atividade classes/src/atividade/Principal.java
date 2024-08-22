package atividade;

public class Principal {

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto("Esponja", 5, 10);
        
        produto1.nome = "Sabao";
        produto1.preco = 3.5;
        produto1.quantidade = 5;
        
        produto1.ExibirDetalhes();
        produto2.ExibirDetalhes();
    }
    
}
