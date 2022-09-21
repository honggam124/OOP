public class S11
{
    public static int countDigitsNumber(int n) {
        int count=0;
        while(n>0) {
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int a=123456;
        System.out.print("Number of digits in "+a+" is "+countDigitsNumber(a));
    }
}