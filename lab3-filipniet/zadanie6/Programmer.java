package zadanie6;

import java.util.Scanner;

public class Programmer extends Employee {
    String languages;

    Programmer(String n, String s, String l){
        l = "English";
        languages = l;

    }

    public static void printinfo(String name, String surname, String languages){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(languages);
    }
}
