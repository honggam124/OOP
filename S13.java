public class S13
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
    public static boolean palindrome(int n) {
        if (n==reverse(n)) return true;
        else return false;
    }
    public static void main(String[] args) {
        int a = 12345;
        int b = 34543;
        if(palindrome(a)==true) System.out.println(a+" is palindrome number.");
        else System.out.println(a+" is not palindrome number.");

        if(palindrome(b)==true) System.out.println(b+" is palindrome number.");
        else System.out.println(b+" is not palindrome number.");
    }
}