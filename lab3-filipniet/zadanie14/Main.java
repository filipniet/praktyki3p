package zadanie14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbe calkowitą: ");
        double a = scan.nextDouble();
        double odp = 1 / a ;
        System.out.println("Odwrotnosc tej liczby to: " + odp);
    }
}
