public class S6
{
    public static double min(double a, double b, double c)
    {
        double min;
        min = (a<b && a<c)? a:b;
        if(min==a) return min;
        min = (b<a && b<c)? b:c;
        return min;
    }
    public static void main(String[] args)
    {
        double a = 1;
        double b = 2;
        double c = 3;
        System.out.print("Minimum between three numbers is "+min(a,b,c));
    }
}