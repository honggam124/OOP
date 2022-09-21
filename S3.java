public class S3
{
    public static double surplus(double di_or, double di_ed)
    {
        return ((di_or/di_ed) - (int) (di_or/di_ed))*di_ed ;
    }
    public static void main(String[] args)
    {
        double divisor = 10;
        double divided_number = 4;
        System.out.print("Surplus: " + surplus(divisor, divided_number));
    }
}