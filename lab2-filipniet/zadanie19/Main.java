package zadanie19;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("wpisz swoją wage(kg): ");
        double waga = scan.nextDouble();
        System.out.println("wpisz swój wzrost(cm): ");
        double wzrost = scan.nextDouble();
        double bmi = waga / Math.pow((wzrost/100), 2);
        System.out.println("bmi: " + bmi);
        System.out.print("bmi jako liczba calkowita: ");
        System.out.format("%.0f%n", bmi);
    }
}
