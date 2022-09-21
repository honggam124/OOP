public class S4
{
    public static double fToC(double F)
    {
        return (F-32)/(9.0/5);
    }
    public static double cToF(double F)
    {
        return F*(9.0/5)+32;
    }
    public static void main(String[] args)
    {
        double C = 1;
        double F = 33.8;
        System.out.println(C +" Celsius = "+cToF(C) +" Fahrenheit");
        System.out.print(F +" Fahrenheit = "+fToC(F) +" Celsius");
    }
}