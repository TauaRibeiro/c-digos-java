package pctCalculadora;
public class Calculadora {
    /**
     Soma
     * 
     * @param a Primeiro par�metro
     * @param b Segundo par�metro
     * @return resultado
     */
    public double somar(double a, double b){
        return a+b;
    }    
    public double subtrair(double a, double b){
        return a-b;
    }    
    public double multiplicar(double a, double b){
        return a*b;
    }    
    public void dividir(double a, double b){
        System.out.println((b == 0) ? "N�o � poss�vel dividir por zero...":a/b);
    }    
}
    