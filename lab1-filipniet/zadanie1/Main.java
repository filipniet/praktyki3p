package zadanie1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj numer miesiąca");
        int miesiac = scan.nextInt();

        if(miesiac < 1 || miesiac > 12){
            System.out.println("Nieprawidłowy numer miesiaca");
        }else{
            switch (miesiac) {
                case 1:
                    System.out.println("Styczen");
                    break;
                case 2:
                    System.out.println("Luty");
                    break;
                case 3:
                    System.out.println("Marzec");
                    break;
                case 4:
                    System.out.println("Kwiecień");
                    break;
                case 5:
                    System.out.println("Maj");
                    break;
                case 6:
                    System.out.println("Czerwiec");
                    break;
                case 7:
                    System.out.println("Lipiec");
                    break;
                case 8:
                    System.out.println("Sierpień");
                    break;
                case 9:
                    System.out.println("Wrzesień");
                    break;
                case 10:
                    System.out.println("Październik");
                    break;
                case 11:
                    System.out.println("Listopad");
                    break;
                case 12:
                    System.out.println("Grudzień");
                    break;
            }
        }
    }
}
