package cadastroGetSet;


import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private static ArrayList<Produto> listaDeProdutos = new ArrayList();

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

    @Override
    public String toString() {
        return "NOME: "+nome+"\nQUANTIDADE: "+quantidade+"\nPREÇO: "+preco;
    }
    
    public static void cadastrarProduto(String nome, double preco, int quantidade){
        Produto produto = new Produto(nome, preco, quantidade);
        
        listaDeProdutos.add(produto);
    }
        
    public static String exibirProduto(){
        if(listaDeProdutos.isEmpty()){
            return "Não há produtos cadastrados...\n";
        }
        StringBuilder resultado = new StringBuilder();
        
        for(Produto produto:listaDeProdutos){
            resultado.append(produto.toString()).append("\n");
        }
        
        return resultado.toString();
    }
    
    public static boolean excluirProduto(String nome){
        for(Produto produto : listaDeProdutos){
            if(produto.getNome().equalsIgnoreCase(nome)){
                listaDeProdutos.remove(produto);
                
                return true;
            }  
        }
        
        return false;
    }
    
    public static boolean atualizarProduto(String procura, String nome, double preco, int quantidade){
        for(Produto produto:listaDeProdutos){
            if(produto.getNome().equalsIgnoreCase(procura)){
                produto.setNome(nome);
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);
                
                return true;
            }
        }
        
        return false;
    }
}
