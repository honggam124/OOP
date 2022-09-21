public class S9
{
    public static int hailstone(int n) {
        if(n==1) return 1;
        out(n);
        if(n%2==0) n/=2;
        else n=3*n+1;
        return hailstone(n); 
    }
    public static void out(int n) {
        if(n%2==0) {
            System.out.println(n+" is even, so we take n/2: "+n/2);
        } else {
            System.out.println(n+" is odd, so we take 3*n+1: "+(3*n+1));
        }
    }
    public static void main(String[] args)
    {
        int n=5;
        if(n==1) System.out.print("n=1");
        else hailstone(n);
    }
}