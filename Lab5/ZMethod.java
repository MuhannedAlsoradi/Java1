import java.util.*;
public class ZMethod {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Z = 0.5sin(X-3.14/sqrt(Y))");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = 0.5*(Math.sin(x-Math.PI/Math.sqrt(y)));
        System.out.println(z);
    }

    
}
