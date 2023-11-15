package zadanie9;

public class Programmer extends Employee {
    String languages;

    public void setLanguages() {
        this.languages = languages;
    }
    public String getLanguages() {
        return languages;

    }

    public String toString() {
        return name +" "+ surname + ", " + languages;
    }
}
