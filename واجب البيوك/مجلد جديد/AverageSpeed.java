
/*Program to compute the average speed in miles*/
public class AverageSpeed {
        
    /**
     * Creates a new instance of <code>AverageSpeed</code>.
     */
    public AverageSpeed() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //To do here
        int kilo = 14;
        double minutes = 45.5;
        double mile = kilo/1.6;
        double hour = minutes/60; 
        System.out.print("The average speed in miles per hour is:\n" + mile/hour + " mile/hour");	
    }
}
