package zadanie9;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        String tab[] = {"p","r","o","g","r","a","m","o","w","a","n","i","e"};
        int a  = tab.length;
        System.out.println("a)");
        tab[0] = tab[0].toUpperCase();
        System.out.println(Arrays.toString(tab));
        System.out.println("b)");
        System.out.println(Arrays.toString(tab).toUpperCase());

    }
}
