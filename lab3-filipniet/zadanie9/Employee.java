package zadanie9;

public abstract class Employee {
    String name;
    String surname;
    Employee(){

    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    public void setter() {
        this.name = name;
        this.surname = surname;
    }
    public String getName() {
        return name;

    }
    public String getSurname() {
        return surname;

    }

}
