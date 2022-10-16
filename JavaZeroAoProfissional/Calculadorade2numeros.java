
// Calculadora de 2 números: digite dois números e em seguida uma operação aritimética.
// Em seguida você verá o resultado da operação.
// By Levi Alves

package JavaZeroAoProfissional;
import java.util.Scanner;

public class Calculadorade2numeros {
    public static void main(String[] args) {
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

        String erro = "digite uma operação válida!";
        String respostaDiv = div ?    "resposta: "   + (v1/v2)   :"" + erro;
        String respostaMulti = multi? "resposta: "   + (v1*v2)   :"" + respostaDiv;
        String respostaSub = sub?     "resposta: "   + (v1 - v2) :"" + respostaMulti;
        String respostaSoma = sum ?   "resposta: "   + (v1 + v2) :"" + respostaSub;
        System.out.println(respostaSoma);

    }
}
