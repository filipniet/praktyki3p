package zadanie11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scan.nextInt();
        for(int i= a; i > 0; i--){
            System.out.println(i + " bottels of beer on the wall,");
            System.out.println(i + " bottels of beer. Take one down pass it around,");
        }
        System.out.println("No more bottels  of beer on the wall no more bottels of beer. Go to the store and buy some more");
    }
}
