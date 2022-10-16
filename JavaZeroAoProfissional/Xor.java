package JavaZeroAoProfissional;

import java.util.Scanner;

public class Xor {

    static void Soma(double a, double b) {
        var c = a + b;
        System.out.println("resposta: " + c);
    }

    static void Sub(double a, double b) {
        var c = a - b;
        System.out.println("resposta: " + c);
    }

    static void Vezes(double a, double b) {
        var c = a * b;
        System.out.println("resposta: " + c);
    }

    static void Divi(double a, double b) {
        var c = a / b;
        System.out.println("resposta: " + c);
    }

    public static void main(String[] args) {
        //leitura dos dados
        Scanner leitor = new Scanner(System.in);
        System.out.println("1º valor: ");
        double v1 = leitor.nextDouble();
        System.out.println("2º valor: ");
        double v2 = leitor.nextDouble();
        System.out.println("operação: ");
        String op = leitor.next();
        leitor.close();

        //calculo

        boolean sum = op.equals("+");
        boolean sub = op.equals("-");
        boolean multi = op.equals("*");
        boolean div = op.equals("/");
        String erro = "error";

    }
}

