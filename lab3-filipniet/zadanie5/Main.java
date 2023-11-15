package zadanie5;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class Main {
    static String a;
    static String b;

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Main m = new Main();

        czytaj_dane(m);
        zapisz_dane_do_pliku(a,b);
        czytaj_dane_z_pliku();
    }
    public static void czytaj_dane(Main m){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz swoje imie: ");
        m.a = scan.nextLine();

        System.out.println("Wpisz swoje nazwisko: ");
        m.b = scan.nextLine();


    }

    public static void zapisz_dane_do_pliku(String a, String b) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("C:\\Users\\fniet\\Desktop\\file.txt", "UTF-8");
        writer.println(a);
        writer.println(b);
        writer.close();
    }

    public static void czytaj_dane_z_pliku() throws FileNotFoundException {
        File obj = new File("C:\\Users\\fniet\\Desktop\\file.txt");
        Scanner scan = new Scanner(obj);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }
}
