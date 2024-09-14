package cadastroGetSet;


import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private static List<Produto> listaDeProdutos = new ArrayList();

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
        }else{
            System.out.println("Pre�o inv�lido!!");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }else{
            System.out.println("Quantidade inv�lida!!");
        }
    }
    
    public static void cadastrarProduto(String nome, double preco, int quantidade){
        Produto produto = new Produto(nome, preco, quantidade);
        
        listaDeProdutos.add(produto);
    }
        
    public static void exibirProduto(){
        for(Produto produto : listaDeProdutos){
            System.out.println("\nNome: "+produto.getNome()
            + "Pre�o: "+produto.getPreco() 
            + "Quantidade: "+produto.getQuantidade());
        }
    }
    
    public static void excluirProduto(){}
    
    public static void atualizarProduto(){}
}
