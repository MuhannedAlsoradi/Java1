import javax.swing.JOptionPane;
import java.util.Scanner;
public class Shopping { 
public Shopping() {
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter price of an item :");
    int p = input.nextInt();
    System.out.print("Enter discount rate :");
    int d = input.nextInt(); 
    int a = p -p*d/100 ;
    System.out.println("You should DAV :" +a);


    }
}