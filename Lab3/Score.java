import java.util.Scanner;
public class Score {
    public Score(){

    }
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the score :");
      int score = input.nextInt();
      if(score>=80&&score<=100)
      System.out.print("A");
      else if (score>=70&&score<=79)
      System.out.print("B");
      else if (score>=60&&score<=69) 
      System.out.print("C");
      else 
      System.out.print("Fail");
    }   
    
}
