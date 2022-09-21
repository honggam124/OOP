public class S12
{
    public static int reverse(int n) {
        int res=0;
        while(n>0)
        {
            res = res*10 + (n%10);
            n/=10;
        }
        return res;
    }
    public static void main(String[] args)
    {
        int a=123456;
        int b=34543;
        System.out.println("Reverse of "+a+" = "+reverse(a));
        System.out.print("Reverse of "+b+" = "+reverse(b));
    }
}