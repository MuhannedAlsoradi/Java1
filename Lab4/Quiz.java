import javax.swing.*;
import java.util.*;
public class Quiz {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of hours :\n");
      int h = input.nextInt();
      System.out.print("Enter the student status :");
      int x = input.nextInt();
      if(x==1)
      System.out.print(25*h);
      else if(x==2)
      System.out.print(35*h);
      else 
      System.out.print("Invalid Input!");
    }
    
}
