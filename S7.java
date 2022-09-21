public class S7
{
    public static boolean checkAlaphanumeric(char c)
    {
        if((c>=48 && c<=57) || (c>=65 &&c<=90) || 
            (c>=97 && c<=122)) return true;
        return false;
    }
    public static void main(String[] args)
    {
        char c = 'c';
        if(checkAlaphanumeric(c)==true) System.out.print("Character "+c+" is alphanumeric.");
        else System.out.print("Character "+c+" isn't alphanumeric.");
    }
}