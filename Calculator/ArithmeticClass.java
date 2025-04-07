import java.util.Scanner;
 class ArithmeticClass extends area {

     
     static Scanner sc= new Scanner(System.in);
     public static void sum(){
        //  int a=10,b=20;
        System.out.print("Enter first number : ");

        int a = sc.nextInt();
        System.out.print("Enter second number : ");
         int b= sc.nextInt();
         int res=a+b;
         System.out.println("Diya huwa numbers ka sum hai : "+res);
        }
        
        public static  void difference(){
            System.out.print("Enter first number : ");

        int a = sc.nextInt();
        System.out.print("Enter second number : ");
         int b= sc.nextInt();
            int res=a-b;
            System.out.println("Diya huwa numbers ka Difference hai : "+res);
        }
        public static  void product(){
            System.out.print("Enter first number : ");

            int a = sc.nextInt();
            System.out.print("Enter second number : ");
             int b= sc.nextInt();
            int res=a*b;
            System.out.println("Diya huwa numbers ka Product hai : "+res);
        }
        public static  void division(){
            System.out.print("Enter first number : ");

        int a = sc.nextInt();
        System.out.print("Enter second number : ");
         int b= sc.nextInt();
         if(a==0 || b==0)
         { 

             System.out.println("Cannot divide by 0");
         }
         else{ 

             
             int res=a/b;
             System.out.println("Diya huwa numbers ka result  hai : "+res);
            }
        }
        public static void select(){
            System.out.println("Welcome to Arithmetic Calculator");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Product");
            
            int choice = sc.nextInt();
            
            
            
    switch (choice) {
                case 1:{
                    sum();
                    break;
                }
                case 2:
                {
                    difference();
                    break;
                }
                case 3:
                {
                    product();
                    break;
                }

                case 4: 
                {
                    division();
                    break;
                }
                
                default:
                {
                    System.out.println("Opps!! Wrong choice");
                }

                break;
            }
    
    
     }
    
        public static void main(String[] args) {
            select();
   
 }
}
 
    


