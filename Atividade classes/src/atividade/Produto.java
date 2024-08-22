package atividade;

public class Produto {
    String nome;
    int quantidade;
    double preco;
    
    Produto(){}
    
    Produto(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    void ExibirDetalhes(){
        System.out.printf("NOME: %s\nQUANTIDADE: %d\nPRECO: R$ %.2f\n\n",
                this.nome, this.quantidade, this.preco);
    }
    
}
