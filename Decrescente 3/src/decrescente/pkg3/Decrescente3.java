package decrescente.pkg3;

public class Decrescente3 {

    public static void main(String[] args) {
        for(int i = 9; i >= -9; i -= 3){
            System.out.print(i!=-9? i+", " : i);
        }
    }
}
