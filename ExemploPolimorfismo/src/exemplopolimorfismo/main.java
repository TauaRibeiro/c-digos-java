package exemplopolimorfismo;

public class main {

    public static void main(String[] args) {
        Eletronico geladeira = new Eletronico("Eletrolux", 20, 2000);
        Vestuario terno = new Vestuario("Palha italiana", 10, 6500);
        
        System.out.println(geladeira.calcularDesconto());
        System.out.println(terno.calcularDesconto());
    }
    
}
