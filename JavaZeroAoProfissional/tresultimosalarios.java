package JavaZeroAoProfissional;

import java.util.Scanner;

public class tresultimosalarios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o 1º salário: ");
        String s1 = leitor.next().replace(",",".");
        System.out.println("Digite o 2º salário: ");
        String s2 = leitor.next().replace(",",".");
        System.out.println("Digite o 3º salário: ");
        String s3 = leitor.next().replace(",",".");
        leitor.close();
        double S1 = Double.parseDouble(s1);
        double S2 = Double.parseDouble(s2);
        double S3 = Double.parseDouble(s3);

        double m = (S1+S2+S3)/3;
        System.out.println("A sua média salarial é: " + m);
    }
}
