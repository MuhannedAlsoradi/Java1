/*Program to compute Area and perimeter of a rectangle*/

public class AreaOfRectangle {
        
    /**
     * Creates a new instance of <code>AreaOfRectangle</code>.
     */
    public AreaOfRectangle() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        double width = 4.5;
        double height = 7.9;
        double area = width*height;
        double perimeter = 2*(width+height);
        System.out.print("The Area of rectangle is: "+ area );
        System.out.print("\nThe perimeter of rectangle is: "+ perimeter );
    }
}
