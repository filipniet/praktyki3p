package zadanie7;

public class Main {
    public static void main(String[] args) {

        Bike a = new Bike("marka", "model");
        MotorBike b = new MotorBike("marka marka", "model model");

        a.printInfo();
        b.printInfo();
    }
}
