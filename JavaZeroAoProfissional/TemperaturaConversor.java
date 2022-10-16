package JavaZeroAoProfissional;

public class TemperaturaConversor {
    public static void main(String[] args) {

    // converter String em Int
        String a = "12";
        int a1 = Integer.parseInt(a);
        System.out.println(a1+a1);
    // converter int em String
        int b = 10;
        String b1 = String.valueOf(b);
        System.out.println(b1+b1);
    //converter int para Double
        int c = 11;
        Double c1 = Double.valueOf(c);
        System.out.println(c1);
    //converter de double pra int
        double d = 13.34;
        Double d1 = Double.valueOf(d);
        int d2 = d1.intValue();
        System.out.println(d2);
    //converter de int pra DOuble
        int e = 45;
        Double e1 = Double.valueOf(e);
        System.out.println(e1);

        float t = 14.45f;
        Float t1 = Float.valueOf(t);
        String t2 = t1.toString();
        System.out.println(t2+t2);

        //casting

        int k = 40;
        byte w =(byte)k;   //(cast explícito!!)
        System.out.println(w);

        double g = 1.999999;
        int g1 = (int) g;
        System.out.println(g1);

        // convertendo numero para string

        int n = 10000;
        Integer n1 = n;
        System.out.println(n1.toString().length());

        int num2 = 124;
        String num3 = Integer.toString(num2);
        System.out.println(num3+num3);

    }
}
