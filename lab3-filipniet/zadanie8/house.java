package zadanie8;

public class house extends Flat{
    float parcelSize;
    public house(String city, String street, float parcelSize)
    {
        super(city, street);
        this.parcelSize = parcelSize;

    }

    public void setParcelSize(float parcelSize)
    {
        this.parcelSize = parcelSize;
    }
    public float getParcelSize()
    {
        return parcelSize;
    }


    @Override
    public String toString()
    {
        return "House{" +
                "parcelSize=" + parcelSize +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
