package pctCalculadora;
public class Calculadora {
    /**
     Soma
     * 
     * @param a Primeiro parâmetro
     * @param b Segundo parâmetro
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
        System.out.println((b == 0) ? "Não é possível dividir por zero...":a/b);
    }    
}
    