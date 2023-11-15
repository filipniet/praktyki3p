package zadanie13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("wpisz liczbe : ");
        String a = scan.nextLine();
        float b;
        b = Float.parseFloat(a);
        System.out.println(b);
    }
}
