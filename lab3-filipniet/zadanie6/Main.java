package zadanie6;

import static zadanie6.Employee.printInfo;
import static zadanie6.Administrator.printInfo;
import static zadanie6.Programmer.printinfo;

public class Main {

    public static void main(String[] args){
        Employee emp = new Employee();
        Administrator adm = new Administrator();
        Programmer pro = new Programmer("Kuba", "Marciniak", "English");
        System.out.println("Employee: ");
        printInfo(emp.name, emp.surname);
        System.out.println("Administrator: ");
        printInfo(adm.name, adm.surname, adm.certificates);
        System.out.println("Programmer: ");
        printinfo(pro.name, pro.surname, pro.languages);

    }


}
