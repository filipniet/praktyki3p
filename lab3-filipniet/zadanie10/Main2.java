package zadanie10;

public class Main2 {
    public static void main(String[] args) {
        int tab[] = {1, 2, 3, 4, 5};
        int a = -1;

        try {
            System.out.println(tab[a]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ujemna wartosc w tablicy nie istnieje");
        }
    }
}
