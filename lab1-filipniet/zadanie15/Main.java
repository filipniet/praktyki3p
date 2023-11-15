package zadanie15;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj a:");
        int a = scan.nextInt();
        System.out.println("Podaj b:");
        int b = scan.nextInt();
        int suma = a;
        if(b>0){
            for(int i = b;i > 0;i-- ){
                suma++;
            }
        }else if(b<0){
            for(int i = b;i < 0;i++ ){
                suma--;
            }
        }

        System.out.println(suma);

    }
}
