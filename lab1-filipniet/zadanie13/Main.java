package zadanie13;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tab[] = new int[8];
        System.out.println("Podaj 1 liczbe: ");
        tab[0] = scan.nextInt();
        System.out.println("Podaj 2 liczbe: ");
        tab[1] = scan.nextInt();
        System.out.println("Podaj 3 liczbe: ");
        tab[2] = scan.nextInt();
        System.out.println("Podaj 4 liczbe: ");
        tab[3] = scan.nextInt();
        System.out.println("Podaj 5 liczbe: ");
        tab[4] = scan.nextInt();
        System.out.println("Podaj 6 liczbe: ");
        tab[5] = scan.nextInt();
        System.out.println("Podaj 7 liczbe: ");
        tab[6] = scan.nextInt();
        System.out.println("Podaj 8 liczbe: ");
        tab[7] = scan.nextInt();
                Arrays.sort(tab);
                System.out.println("Posortowane liczby: ");

                for (int i = 0; i < tab.length; i++)
                {
                    System.out.print(tab[i] + " ");
                }


    }
}
