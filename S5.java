public class S5
{
    public static boolean leadYear(int y)
    {
        if (y%400==0)  return true;
        if (y%4==0 && y%100!=0) return true;
        return false;
    }
    public static void main(String[] args)
    {
        int year = 2000;
        if (leadYear(year)==true) System.out.print(year +" is lead year.");
        else System.out.print(year +" isn't lead year.");
    }
}