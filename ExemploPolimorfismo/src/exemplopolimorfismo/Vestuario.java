package exemplopolimorfismo;

public class Vestuario extends Produto{
    public Vestuario(String nome, int estoque, double preco){
        super(nome, estoque, preco);
    }
    
    @Override
    public double calcularDesconto(){
        return preco*0.90;
    }
}
