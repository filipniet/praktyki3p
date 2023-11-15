package zadanie6;


import java.util.Scanner;

public class Employee {
    String name;
    String surname;

    Employee(){
        
    }
    Employee(String n, String s){
        n = "filip";
        s = "nietyksza";
        name = n;
        surname = s;

    }

    public static void printInfo(String name, String surname){
        System.out.println(name);
        System.out.println(surname);
    }
}
