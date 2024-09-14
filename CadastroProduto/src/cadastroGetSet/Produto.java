package cadastroGetSet;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
            System.out.println("Preço inválido!!");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }else{
            System.out.println("Quantidade inválida!!");
        }
    }
    
    public static void cadastrarProduto(String nome, double preco, int quantidade){
        Produto produto = new Produto(nome, preco, quantidade);
        
        listaDeProdutos.add(produto);
    }
        
    public static void exibirProduto(javax.swing.JTextArea saida, String nome){
        for(Produto produto : listaDeProdutos){
            JOptionPane.showInternalMessageDialog(saida, "\nNOME: "+produto.getNome());
            JOptionPane.showInternalMessageDialog(saida, "QUANTIDADE: "+produto.getQuantidade());
            JOptionPane.showInternalMessageDialog(saida, "PREÇO: "+produto.getPreco());
        }
    }
    
    public static void excluirProduto(String nome){
        for(Produto produto : listaDeProdutos){
            if(produto.getNome().equals(nome)){
                listaDeProdutos.remove(produto);
                
                break;
            } 
            
        }
    }
    
    public static void atualizarProduto(){}
}
