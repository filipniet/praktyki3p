package zadanie8;

public class Residence extends house{
    float garageSize;
    public Residence(String city, String street, float parcelSize, float garageSize)
    {
        super(city, street, parcelSize);
        this.garageSize = garageSize;

    }

    public void setGarageSize(float garageSize)
    {
        this.garageSize = garageSize;
    }
    public float getGarageSize()
    {
        return garageSize;
    }



    @Override
    public String toString()
    {
        return "Residence{" +
                "garageSize=" + garageSize +
                ", parcelSize=" + parcelSize +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

}
