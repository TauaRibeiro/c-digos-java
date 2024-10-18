package exemplopolimorfismo;

public class Produto {    
    protected String nome;
    protected int estoque;
    protected double preco;
    
    public Produto(String nome, int estoque, double preco){
        this.nome = nome;
        this.estoque = estoque;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if(nome.length()>= 4){
            this.nome = nome;
            return true;
        }
        return false;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean setEstoque(int estoque) {
        if(estoque >= 0){
            this.estoque = estoque;
            return true;
        }
        return false;
    }

    public double getPreco() {
        return preco;
    }

    public boolean setPreco(double preco) {
        if(preco >= 0){
            this.preco = preco;
            return true;
        }
        return false;
    }
    
    public double calcularDesconto(){
        return preco*0.95;
    }
}
