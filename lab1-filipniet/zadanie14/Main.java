package zadanie14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj 1 liczbe:");
        double a = scan.nextDouble();
        System.out.println("Podaj 2 liczbe:");
        double b = scan.nextDouble();
        System.out.println("Wybierz operacje: suma,roznica,iloczyn,iloraz?(1/2/3/4)");
        int wybor = scan.nextInt();
        switch(wybor){
            case 1:
                System.out.println("Suma: "+ (a+b));
                break;
            case 2:
                System.out.println("Roznica: "+ (a-b));
                break;
            case 3:
                System.out.println("Iloczyn: "+ (a*b));
                break;
            case 4:
                System.out.println("Iloraz: "+ (a/b));
                break;
            default:
                System.out.println("wybierz pomiedzy 1-4");
                break;
        }

    }
}
