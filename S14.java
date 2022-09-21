import java.util.*;
public class S14
{
    public static void menu() {
        System.out.println("-------Menu------");
        System.out.println("1. Coca");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.println("4. Snack");
        System.out.println("5. Shutdown Machine");
        System.out.println("please enter the number:");
    }
    public static int choose(int a) {
        switch(a){
            case 1:
                System.out.print("The price of Coca is: 2$, ");
                return 1;
            case 2: 
                System.out.print("The price of Pepsi is: 3$, ");
                return 1;
            case 3:
                System.out.print("The price of Sprite is: 4$, ");
                return 1;
            case 4:
                System.out.print("The price of Snack is: 5$, ");
                return 1;
            case 5:
                return 3;
            default:
                return 2;
        }
    }
    public static double sub(double sub_or, double be_sub)
    {
        return sub_or - be_sub ;
    }
    public static void outSur(int stt, double money) {
        switch(stt){
            case 1: 
                if(sub(money,2)>=0) System.out.println("Your change is "+sub(money, 2));
                else System.out.println("Not enough money to buy this item. Please select again.");
                break;
            case 2: 
                if(sub(money,3)>=0) System.out.println("Your change is "+sub(money, 3));
                else System.out.println("Not enough money to buy this item. Please select again.");
                break;
            case 3: 
                if(sub(money,4)>=0) System.out.println("Your change is "+sub(money, 4));
                else System.out.println("Not enough money to buy this item. Please select again.");
                break;
            case 4: 
                if(sub(money,5)>=0) System.out.println("Your change is "+sub(money, 5));
                else System.out.println("Not enough money to buy this item. Please select again.");
        }
    }
    public static void main(String[] args)
    {
        int input;
        Scanner jain = new Scanner(System.in);
        menu();
        input = jain.nextInt();
        while(input!=5 && choose(input)!=3)
        {
            while(choose(input)==1) 
            {
                System.out.println("please enter the amount of money: ");
                double money = jain.nextDouble();
                outSur(input,money);
                menu();
                input = jain.nextInt();
            }
            while(choose(input)==2)
            {
                System.out.println("Please number the valid number.");
                menu();
                input = jain.nextInt();
            }
        }
        System.out.println("Machine is shutting down.");
        jain.close();
    }
}