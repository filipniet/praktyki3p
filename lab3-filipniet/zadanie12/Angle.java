package zadanie12;

public class Angle {
    private double x;
    public Angle(double x) {
        this.x = Math.toRadians(x);
    }
    public double sin(double x)
    {
        return Math.sin(x);
    }
    public double cos(double x)
    {
        return Math.cos(x);
    }
    public double tg(double x)
    {
        return Math.tan(x);
    }
    public double ctg(double x)
    {
        return 1.0/Math.tan(x);
    }
    public double sec(double x)
    {
        return 1.0/Math.cos(x);
    }

    public double cosec(double x)
    {
        return 1.0/Math.sin(x);
    }

    public static double radian(double x){
        return Math.toRadians(x);
    }

    public static double degree(double x){
        return Math.toDegrees(x);
    }
}
