package zadanie4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int a = scan.nextInt();
        int b = 1;
        for(int i=1;i<=a;i++){
            b *= i;
        }
        System.out.println(b);
    }
}
