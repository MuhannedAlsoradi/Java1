

import java.util.Scanner;
public class Volume {
        
    /**
     * Creates a new instance of <code>Volume</code>.
     */
    public Volume() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer the value of radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        final double PI = 3.14; 
        double area = radius*radius*PI;
        double volume = area*length;
        System.out.print("The area of cylinder is: " + area);
        System.out.print("\nThe volume of cylinder is: " + volume);
    }
}
