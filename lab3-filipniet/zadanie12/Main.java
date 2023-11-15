package zadanie12;

import zadanie11.Angle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj kąt: ");
        double kat = scan.nextDouble();
        double r = zadanie12.Angle.radian(kat);
        double d = zadanie12.Angle.degree(r);

        Angle rad = new Angle(r);
        Angle st = new Angle(d);
        System.out.println("Radiany: ");
        System.out.println("sin = " + rad.sin(r));
        System.out.println("cos = " + rad.cos(r));
        System.out.println("tg = " + rad.tg(r));
        System.out.println("ctg = " + rad.ctg(r));
        System.out.println("sec = " + rad.sec(r));
        System.out.println("cosec = " + rad.cosec(r));
        System.out.println("Stopnie: ");
        System.out.println("sin = " + st.sin(d));
        System.out.println("cos = " + st.cos(d));
        System.out.println("tg = " + st.tg(d));
        System.out.println("ctg = " + st.ctg(d));
        System.out.println("sec = " + st.sec(d));
        System.out.println("cosec = " + st.cosec(d));

    }
}
