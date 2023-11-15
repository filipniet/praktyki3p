package zadanie5;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String a = scan.nextLine();
        int b = a.length();
        if(!a.endsWith("a") || a.equalsIgnoreCase("kuba") ){
            System.out.println(a + " jest mezczyna");
        }else {
            System.out.println(a + " jest kobieta");
        }
    }
}
