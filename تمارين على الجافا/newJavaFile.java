/**
 * @(#)ComputeAvarege.java
 *
 *
 * @author 
 * @version 1.00 2022/3/1
 */
import java.util.Scanner;
 class ComputeAvarege {
        
    /**
     * Creates a new instance of <code>ComputeAvarege</code>.
     */
    public ComputeAvarege() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three value :");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        //Compute the avarege 
        double average = (number1+number2+number3)/3;
        System.out.println("The average of "+number1+" "+number2+" "+number3+" is "+average);
    }
}
