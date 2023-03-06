import java.util.*;
public class Bank {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a ; 
        double b = 3000;
        double usd ;
        double jd ;
        int password ;
        String name ;
        System.out.print("Login to the bank system :\n1-login as Administrator\n2-Login as a customer\n3-Exit\n");
        int x = input.nextInt() ;
        switch(x){
            case 1 :
            System.out.print("1-login as Administrator\nEnter Username :\n");
            name = input.next();
            System.out.print("Enter Password :\n");
            password  = input.nextInt();
            break;
            case 2 :
            System.out.print("1-login as custmor\nEnter Username :");
            name = input.next();
            System.out.print("Enter Password :");
            password  = input.nextInt();
            break;
            case 3 :
            System.exit(0);
            break;
            default :
            System.out.print("Error");
            break;
        }
        do{
            System.out.print("1-Deposit\n2-Withdrawal\n3-See Balance\n4-Convert between JD & USD \n5-Exit");
            System.out.print("\nEnter your choice :");
            a = input.nextInt();
            switch(a){
                case 1 :
                System.out.print("Add deposit :");
                int d = input.nextInt() ;
                b+=d;
                System.out.print("Process completed successfuly\n");
                break;
                case 2 :
                System.out.print("Enter the value of withdrawal[50-100-200-500] :");
                int w = input.nextInt();
                if((w==50)||(w==100)||(w==200)||(w==500));
                b-=w;
                System.out.print("Process completed successfuly\n");
                break;
                case 3 :
                System.out.print("Your Balance is " + b + " USD\n" );
                System.out.print("Process completed successfuly\n");
                break;
                case 4 :
                System.out.print("choose the type of coin to convert[JD(D)-USD(U)] :");
                char coin = input.next().charAt(0);
                if(coin=='D')
                {
                System.out.print("Enter the value of JD :");   
                jd = input.nextDouble(); 
                usd = jd/0.7;
                System.out.print("output " + usd + "$\n");
                    }
                else if(coin=='U')
                {
                    System.out.print("Enter the value of USD :");   
                usd = input.nextDouble(); 
                  jd = usd*0.7;
                  System.out.print("output " + jd + "\n");
                }
                else
                System.out.print("Invalid coin!\n");    
                break;
                 case 5 :
                System.exit(0);
                break;
                default :
                System.out.print("Invalid input!");
                break;


            }
        }while(a!=5);



    }
    
}
