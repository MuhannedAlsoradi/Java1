/*Program to find the number of years*/

import java.util.Scanner;
public class Years {
        
    /**
     * Creates a new instance of <code>Years</code>.
     */
    public Years() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter the number of minutes:");
        Scanner input = new Scanner(System.in);
        double minutes = input.nextDouble();
        double year = minutes/(365*24*60);
        year = Math.floor(year);
        double day = (minutes/(365*24*60)-year)*365;
        day = Math.floor(day);
        System.out.print(minutes + " minutes is approximately " + year + " Years and " + day + " days" );
    }
}
