/**
 * @(#)ComputeArea.java
 *
 *
 * @author 
 * @version 1.00 2022/3/1
 */
import java.util.Scanner;
public class ComputeArea {
        
    /**
     * Creates a new instance of <code>ComputeArea</code>.
     */
    public ComputeArea() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double raduis ;
        double area ;
        //raduis=20;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of raduis :");
        System.out.print("\nhi");
        double raduis = input.nextDouble();
        double area = raduis*raduis*3.14159 ;
        //display results 
        System.out.print("The area of the circle of radius "+raduis+" is "+area);
    }
}
