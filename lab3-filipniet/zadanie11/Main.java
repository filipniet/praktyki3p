package zadanie11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj kąt w radianach: ");
        double r = scan.nextDouble();

        Angle rad = new Angle(r);

        System.out.println("sin = " + rad.sin(r));
        System.out.println("cos = " + rad.cos(r));
        System.out.println("tg = " + rad.tg(r));
        System.out.println("ctg = " + rad.ctg(r));
        System.out.println("sec = " + rad.sec(r));
        System.out.println("cosec = " + rad.cosec(r));

    }
}

