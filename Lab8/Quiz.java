import java.util.*;
public class Quiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numStudents ;
        double avg = 0.0;
        int sum = 0;
        System.out.print("Enter the number of students :");
        numStudents = input.nextInt();
        int []grades = new int[numStudents];
        for(int i=0 ; i<grades.length ; ++i){
          grades[i] = input.nextInt();
        if(grades[i]>100||grades[i]<0){
          System.out.println("invalid input , try again ...");
          grades[i] = input.nextInt();
        }
        sum +=grades[i];



    }
    avg = sum / numStudents*1.0;
    System.out.println("The average is " +avg);
    
}
}