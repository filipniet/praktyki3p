package zadanie6;

import java.util.Scanner;

public class Administrator extends Employee{
    static String certificates;

    Administrator(){

        certificates = "certyfikat";
    }

    public static void printInfo(String name, String surname, String certificates){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(certificates);
    }
}
