package zadanie5;

public class Student {
    String imie;
    String nazwisko;
    String miasto;
    int wiek;


    public Student() { // 1
    }
    public Student(String imie, String nazwisko, String miasto, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.wiek = wiek;
    }
    public static void printBasicData(Student x){
        System.out.println(x.imie + ", " + x.nazwisko + ", " +x.miasto + ", " +x.wiek);

    }

}
