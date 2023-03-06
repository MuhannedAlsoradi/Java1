import java.util.Scanner;
public class LeapYear {
    public LeapYear(){

    }
       public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter the year :");
       int year = input.nextInt();
       boolean isLeapYear = ((year%4==0&&year%100!=0)||(year%400==0));
       System.out.print("Is " + year + " Leap year ? " + isLeapYear);
    }
}
