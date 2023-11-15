package zadanie10;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int dzielenie = a/b;
            System.out.println(dzielenie);
        } catch(ArithmeticException e) {
            System.out.println("nie mozna dzielic przez 0");
        } finally{
            System.out.println("p");
        }
    }
}
