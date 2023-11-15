package zadanie2;
import java.util.Scanner;
public class MyWater {
    static double suma = 0;
    static int iloscduza = 0;
    static int iloscsrednia = 0;
    static int iloscmala = 0;
    public static void addLarge(double x){
        suma += 2*x;
        iloscduza+= x;
    }
    public static void addMedium(double x){
        suma += 1*x;
        iloscsrednia +=x;
    }
    public static void addSmall(double x){
        suma+= 0.5*x;
        iloscmala+= x;
    }

    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Wybierz opcje: dodaj wode - 1, zakoncz dodawanie - 2 (1/2)");
            int opcja = scan.nextInt();
            if(opcja ==1){
                System.out.println("Wybierz opcje: duza woda - 1, srednia woda - 2, mala woda - 3 (1/2/3)");
                int opcja2 = scan.nextInt();
                switch (opcja2){
                    case 1:
                        System.out.println("Ile butelekt chcesz dodac(1 = 2l)");
                        double duza = scan.nextDouble();
                        addLarge(duza);
                        break;
                    case 2:
                        System.out.println("Ile butelekt chcesz dodac(1 = 1l)");
                        double srednia = scan.nextDouble();
                        addMedium(srednia);
                        break;
                    case 3:
                        System.out.println("Ile butelekt chcesz dodac(1 = 0.5l)");
                        double mala = scan.nextDouble();
                        addSmall(mala);
                        break;
                    default:
                        System.out.println("Nie mozesz wybrac tej opcji");
                }
            }else if(opcja == 2){
                System.out.println("Mam teraz "+ suma + " litrow wody.");
                System.out.println("Duzych butelek: "+ iloscduza);
                System.out.println("Srednich butelek "+ iloscsrednia);
                System.out.println("Malych butelek "+ iloscmala);
                break;
            }else{
                System.out.println("Nie ma takiej opcji");
            }
        }
    }
}
