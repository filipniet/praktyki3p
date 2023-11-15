package zadanie20;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int a = (int) (Math.random()*(100-1+1)+1);
        int x;
        int proby = 0;
        while(true){
            System.out.println("Zgadnij liczbe: ");
            x = scan.nextInt();
            if(x == a){
                System.out.println("Gilbert!");
                System.out.println("Nieudanych prób: " + proby);
                break;
            }else if(x >a){
                System.out.println("zle! liczba jest mniejsza");
                proby++;
            }else if(x <a){
                System.out.println("zle! liczba jest wieksza");
                proby++;
            }
        }
    }
}
