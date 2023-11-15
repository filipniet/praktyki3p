import java.util.Arrays;
import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int tab[] = new int[7];


        for (int i=0;i<=7;i++){
            System.out.println("Podaj "+ (i + 1)  +" liczbe: ");
            tab[i] = obj.nextInt();
        }

        Arrays.sort(tab);
        System.out.println("Liczby posortowane: ");

        for (int i = 0; i < tab.length; i++)
        {
            System.out.print(tab[i] + " ");
        }


    }
}