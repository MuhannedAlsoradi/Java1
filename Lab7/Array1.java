import java.util.*;
public class Array1 {
    public static void main(String args[]){
        int x[] = new int[10];
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double avg ;
        System.out.println("Enter Ten numbers :");
        for(int i =0;i<x.length;++i){
            x[i] = input.nextInt();
            sum +=x[i];
        }
        avg = sum/10;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + avg);
    }  
}
