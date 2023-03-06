public class TestMethods {
    /*Main method*/
    public static void main(String[] args){
        int i = 5;
        int j = 2;
        int k = max(i,j);
        System.out.println("The maximum between " + i + " and " +  j + " is " + k );
        nprint("Hi muhanned\n" , 4 );
        int num1 = 1 ;
        int num2 = 2 ;
        System.out.println("Before invoking the swap method, n1 is " + num1 + " n2 is " + num2 );
        swap(num1 , num2);
        System.out.println(" After invoking the swap method, n1 is " + num1 + " n2 is " + num2 );
        System.out.println("The maximum between 3 and 4 is " + max(3,4));
        System.out.println("The maximum between 3.0 and 5.4 is " + max(3.0,5.4));
        System.out.println("The maximum between 3.0, 5.4 and 10.14 is " + max(3.0,5.4,10.14));
 
    }
    /*Max method*/
    public static int max(int num1 , int num2){
        int result;
        if(num1>num2)
        result = num1;
        else
        result = num2;
        return result ;
    }
    /*nprint method*/
    public static void nprint(String message , int n){
        for(int i = 0 ; i<n ; ++i)
          System.out.print(message);
    }
    /*pass by value method*/
    public static void swap(int n1 , int n2){
        System.out.print("\tInside the swap method\n");

        System.out.print("Before swapping n1 is " + n1 + " n2 is " + n2);
        int temp ; 
        temp = n1 ;
        n1 = n2 ;
        n2 = temp ; 
        System.out.print("\t\tAfter swapping n1 is " + n1 + " n2 is " + n2 );
    }
    /*Max method #2*/
    public static double max(double num1 , double num2){
        double result;
        if(num1>num2)
        result = num1;
        else
        result = num2;
        return result ;

    }
    /*Max method #3*/
    public static double max(double num1 , double num2 , double num3){

        return max(max(num1,num2),num3) ;

    }


    
}
