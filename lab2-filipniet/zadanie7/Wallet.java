package zadanie7;

public class Wallet {
    public static float money;

    Wallet() {
        money = 3000;
    }
    public static void addMoney(int x){
        money += x;
    }
    public static void removeMoney(int x){
        money -= x;
    }
    public static void printAmount(){
        System.out.println(money);
    }
}

