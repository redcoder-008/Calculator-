import java.util.Scanner;

public class interst {
    public static void simpleInterst()
    {
        int p=100,r=10,t=1;
        int si= (p*t*r)/100;
        System.out.println("The interst is :" +si);

    }
    public static void amount()
    {
        int p=100,r=10,t=1;
        int si= (p*t*r)/100;
        int amountt= si+p;
        System.out.println("The interst is :" +amountt);

    }
    public static void select()
    {
        System.out.println("welcome to interest calculator");
        System.out.println("Press 1 for Simple Interst");
        System.out.println("Press 2 for Principal Amount");
        System.out.println("Press 0 for home");
        Scanner sc= new Scanner(System.in);
        int choice = sc.nextInt();
        
        switch(choice){
            case 0:{
                System.out.println("home");

                
                break;
            }
            case 1:
            {
                simpleInterst();
                break;
            }
            case 2:
            {
                amount();
                break;
            }
            default:
            {
                System.out.println("Kripiya sahi option select kare");
            }
        }
    }

    
}
