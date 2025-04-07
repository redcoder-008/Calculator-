import java.util.Scanner;

public class home  extends ArithmeticClass {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        ArithmeticClass A= new ArithmeticClass();

        
        
        System.out.println("Welcome to karan's Calculator");
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Press 1 for Arithmetic Calculator");
        System.out.println("Press 2 for Area Calculator");
        System.out.println("Press 3 for Interest Calculator");
        
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();


         
        
        
        switch (choice) {
            case 1:{
                ArithmeticClass a = new ArithmeticClass();
                a.select();
                System.out.println("Thanks for using Arithmetic Calculator");

                
                break;
            }
            case 2:
            {
                area b= new area();
                b.select();
                System.out.println("Thanks for using Area calculator");
            }
            System.out.println("Thanks for using area calculator ");
            break;
            case 3:
            interst c= new interst();
            c.select();
            System.out.println("Thanks for using Interest calculator");
            break;
            
            
            
            default:
            System.out.println("Opps!! Wrong choice");
            break;
        }
            
                System.out.println( "Made by Karan...");
                sc.close();
                
            }
            
            
        }
        
    