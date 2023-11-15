package zadanie6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        System.out.println("Podaj a: ");

        int a = scan.nextInt();
        System.out.println("Podaj b: ");
        int b = scan.nextInt();
        System.out.println("Podaj c: ");
        int c = scan.nextInt();
        System.out.println(Math.max(Math.max(a, b), c));


    }
}
