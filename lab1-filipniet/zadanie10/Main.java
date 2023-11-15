package zadanie10;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double pi = 3.1416;

        System.out.println("Podaj promien:");
        double r = scan.nextDouble();
        double objetosc = 4*pi*r*r*r/3;
        System.out.println("Objętosc kuli wynosi " + objetosc);


    }
}
