/**
 * @(#)Area.java
 *
 *
 * @author 
 * @version 1.00 2022/3/7
 */
import java.util.Scanner;
public class Average {
        
    /**
     * Creates a new instance of <code>Area</code>.
     */
    public Average() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three value:");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double avg = (number1+number2+number3)/3;
        System.out.print("The avg between " + number1 + " " + number2 +" "+ number3 + " is " + avg);
    }
}
