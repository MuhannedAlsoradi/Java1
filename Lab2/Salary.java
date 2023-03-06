import java.util.Scanner;
public class Salary {
    public Salary() {

    }
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter worked hour :");
    int hour = input.nextInt();
    int salary ;
    if(hour<=40)
    salary = hour*6;
    else 
    salary = 240 + (hour-40)*10;
    System.out.print("Salary of a person is :"+salary);

    }
    
}
