package zadanie3;
public class Box {
    int szerokosc;
    int wysokosc;

    public Box(int szerokosc, int wysokosc) {
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }


    static void joinDiagonal(Box a){
        System.out.println(a.szerokosc + a.wysokosc);
    }
    void joinHorizontal(int a, int b){
        System.out.println(a+b);
    }
    void joinVertical(int a, int b){
        System.out.println(a+b);
    }

    public static void main(System[] args){
        Box box1 = new Box(12, 23);
        joinDiagonal(box1);
    }
}
