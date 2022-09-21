public class S8 {
    public static int a(int n) {
        int S=0;
        for(int i=1; i<=n; i++) S+=i;
        return S;
    }
    public static long b(int n) {
        long P=1;
        for(int i=1; i<=n; i++) P*=i;
        return P;
    }
    public static long c(int n) {
        long S=0;
        for(int i=0; i<=n; i++) S+= Math.pow(2,i);
        return S;
    }
    public static double d(int n) {
        double S=0;
        for(int i=1; i<=n; i++) S+=1.0/(2*i);
        return S;
    }
    public static long e(int n) {
        long S=0;
        for(int i=1; i<=n; i++) S+=i*i;
        return S;
    }
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println("a) S = "+a(n));
        System.out.println("b) S = "+b(n));
        System.out.println("c) S = "+c(n));
        System.out.println("d) S = "+d(n));
        System.out.print("e) S = "+e(n));
    }
}