package zadanie7;

public class Bike {
    public String brand;
    protected String name;
    private String type = "Bike";

    public Bike() {
    }
    public Bike(String brand, String name)
    {
        this.brand = brand;
        this.name = name;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void printInfo(){
        System.out.println(brand + ", " + name + ", " + type);
    }
}
