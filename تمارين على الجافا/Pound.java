public class Pound {
    public Pound()
    {

    }
    public static void main(String[] args){
        double kilo = 50 , pound = 0.4535 ; 
        int i ; 
        for(kilo=50;kilo <=120;kilo+=10)
        {
            kilo*=pound;
            System.out.print(kilo + " \t " + pound + "\n");
        }

} }
