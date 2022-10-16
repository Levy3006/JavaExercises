package JavaZeroAoProfissional;

public class DesafioExpressao {
    public static void main(String[] args) {
        int a = 6*(3+2);
        int b = (1-5)*(2-7)/2;
        int c = 10;

        int fator1    = (int)(Math.pow(a, 2)/(3*2) -Math.pow(b, 2));
        int dividendo = (int)Math.pow(fator1, 3);
        int resultado = (dividendo/(int)Math.pow(c, 3));
        System.out.println("resposta: " + resultado);

    }
}
