package mostrando.pares;

public class MostrandoPares {
    public static void main(String[] args) {
        for(int numero = 0; numero <= 10; numero += 2){
            System.out.printf("%d%s", numero, (numero == 10) ? "\n" : ", ");
        }
    }
}
