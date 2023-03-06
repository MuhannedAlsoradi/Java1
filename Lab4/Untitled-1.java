public class Untitled-1 {
    Scanner input = new Scanner(System.in);
    double b = 3000;
    int a ;
    do{
        System.out.print("\n1.Deposit\n2.withdrawal\n3.See Balance\n4.Exit");
        System.out.println("\nEnter your choice:");
        a = input.nextInt();
        switch(a){
            case 1 : 
            System.out.print("Add deposit : ");
            int d = input.nextInt();
            b+=d;
            break;
            case 2 :
            System.out.print("Enter the value of withdrawal :");
            int w = input.nextInt();
            if((w==50)||(w==100)||(w==200)||(w==500))
            b-=w;
            break;
            case 3 :
            System.out.print("Your deposit is " + b);
            break;
            case 4 : 
            System.exit(0);
            break;
            default :
            System.out.print("Invalid input");
        }

     }while(a!=4);


    
}
