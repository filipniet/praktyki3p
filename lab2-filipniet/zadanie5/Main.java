package zadanie5;
import java.util.Scanner;

import static zadanie5.Student.printBasicData;

public class Main {



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Student o = new Student("jakub","jakubowski" ,"warszawa",20);
        Student a = new Student();
        int uczniowie = 0;

        System.out.println("Wyswietl stardandowego studenta - 1, stworz swojego - 2");
        int pyt = scan.nextInt();
        switch(pyt){
            case 1:
                printBasicData(o);
                break;
            case 2:
                System.out.println("Imie:");
                a.imie = scan.nextLine();
                System.out.println("Nazwisko:");
                a.nazwisko = scan.nextLine();
                System.out.println("Miasto:");
                a.miasto = scan.nextLine();
                System.out.println("Wiek:");
                a.wiek = scan.nextInt();
                uczniowie++;
                printBasicData(a);
                break;




        }


    }

}
