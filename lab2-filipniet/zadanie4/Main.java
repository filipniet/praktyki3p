package zadanie4;

import static zadanie4.Tv.printBasicData;

public class Main {
    public static void main(String[] args){
        Tv tv = new Tv();
        tv.producent = "Philips";
        tv.model = "Ambilight";
        tv.rok = 2021;
        tv.cena = 6000;
        printBasicData();
    }
}
