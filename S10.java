public class S10
{
    public static int sumFirstAndLast_DigitNumber(int n) {
        int first = n%10;
        while(n>10) {
            n/=10;
        }
        return first+n;
    }
    public static void main(String[] args)
    {
        int a = 12345;
        System.out.print("Sum of the first digit and the last digit "+a+": "+sumFirstAndLast_DigitNumber(a));
    }
}