package zadanie3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj slowo: ");
        String wyraz = scan.nextLine();
        int dlugosc = wyraz.length();

        int aa = 0;
        int a = (dlugosc - 1);
        for (int i = 0; i < dlugosc; i++) {

            if (wyraz.charAt(i) != wyraz.charAt(a)) {
                aa = 1;
                break;
            }
            a--;
        }

        if (aa == 1)
            System.out.println("slowo nie jest palindromem");
        else {
            System.out.println("slowo jest palindromem");
        }
    }
}
