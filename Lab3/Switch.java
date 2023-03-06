import java.util.Scanner;
public class Switch {
    public Switch()
    {
        
    }
    public static void main(String[] args){
    Scanner input = new Scanner(System.in) ; 
    System.out.print("Enter the operation :");
    char a = input.next().charAt(0);
    System.out.print("Enter two numbers :");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    switch(a){
    case '+' :
    System.out.print(number1+number2);
    break;
    case '-' :
    System.out.print(number1-number2);
    break;
    case '*' :
    System.out.print( number1*number2);
    break;
    case '/' :
    System.out.print(number1/number2);
    break;
    default :
    System.out.print("Invalid input!");
    }
   

    }
}
