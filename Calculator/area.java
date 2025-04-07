import java.util.Scanner;

public class area extends interst {
    
    public   static void square(){ 
       Scanner sc = new Scanner(System.in);
System.out.print("Enter the lenght of the square");
        int l=sc.nextInt();
        sc.close();
        System.out.println("Apka diya huwa length k anusar area hai : " + l*l);
    }
   public   static void rectangle(){
        int l=5,b=10;
        System.out.println("Apka diya huwa length aur breadth k anusar area hai : " + l*b);
    }
   public   static void triangle(){
        int b=5,h=10;
        System.out.println("Apka diya huwa base aor height k anusar triangle ka area hai : " + 0.5*b*h);
    }
   public   static void circle(){
        int r=5;
        System.out.println("Apka diya huwa length k anusar area hai : " + 3.142*r*r);
    }
    public static void select(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Area calculator me apka suwagat hai");
        System.out.println("Press 1 for Area of Square");
        System.out.println("Press 2 for Area of Rectangle");
        System.out.println("Press 3 for Area of Triangle");
        System.out.println("Press 4 for Area of Circle");
        int choice= sc.nextInt();
        sc.close();
        switch (choice) {
            case 1:
            {
                square();
         break;
     }
     case 2:{
         rectangle();
         break;
     }
     case 3:{
         triangle();
         break;
     }
     case 4:
     {
         circle();
         break;
     }
     
     
     default:
     {
         System.out.println("Opps apne galat option choose kiya..");
         break;
     }
    
 }
    }
    public static void main(String[] args) {
      
       select();
        

    }
    

    }
    
    


