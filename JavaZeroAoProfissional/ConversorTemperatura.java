
// Conversor de temperatura Celsius para farenheit e vice versa. escolha como deseja converter,
// jogue os valores e veja a conversão.

package JavaZeroAoProfissional;
import java.util.Scanner;
public class ConversorTemperatura {
    public static void main(String[] args) {

        System.out.println("==== Bem Vindo ao Conversor de Escalas Termométricas! ====\n");
        System.out.println("Se deseja converter de Celsius para Fahrenheit digite 1: " +
                " \nSe deseja converter de Fahrenheit pra Celsius, digite 2:");
        Scanner leitor = new Scanner(System.in);
        int digito = leitor.nextInt();
        if (digito == 1){
            System.out.println("Ok, Vamos Começar!");
            System.out.println("Digite a temperatura em Celsius: ");
            float Tc = leitor.nextFloat();
            float Tf = (float)(Tc*1.8) + 32;
            System.out.println("Correspondente em Fahrenheit: " + Tf + "ºF");
        }else if(digito == 2){
            System.out.println("Ok, Vamos começar!");
            System.out.println("Digite a temperatura em Fahrenheit: ");
            float Tfah= leitor.nextFloat();
            float Tc1 = (float)((Tfah - 32)/1.8);

            System.out.println("Correspondente em Celsius: " + Tc1 + "ºC");
        }else{
            System.out.println("digite apenas 1 ou 2!");
        }
    }
}
