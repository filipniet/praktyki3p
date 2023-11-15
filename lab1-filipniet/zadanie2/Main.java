package zadanie2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj wiek");
        int rok = scan.nextInt();
        boolean pelnoletniosc;
        if(rok < 18){
            pelnoletniosc = false;
            System.out.println(pelnoletniosc);
        }else{
            pelnoletniosc = true;
            System.out.println(pelnoletniosc);
        }
    }

}
