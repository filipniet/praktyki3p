package zadanie7;

import static zadanie7.Wallet.addMoney;
import static zadanie7.Wallet.removeMoney;
import static zadanie7.Wallet.printAmount;

public class Main {
    public static void main(String args[]) {
        Wallet a = new Wallet();
        for(int i = 0; i < 6;i++){
            addMoney(5000);
            removeMoney(2000);
            removeMoney(1000);
        }
        printAmount();
    }
}
