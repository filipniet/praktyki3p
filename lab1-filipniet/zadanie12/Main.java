package zadanie12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int a = scan.nextInt();

        for(int i = a; i > 0;i--){

            for(int j = i; j > 0;j--){
                System.out.print(" ");
            }
            for(int k = 2*(a - i) + 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
