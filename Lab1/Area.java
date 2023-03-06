/*Program to compute the average speed in miles*/
public class AverageSpeed {
public AverageSpeed() {
}
public static void main(String[] args) {
// TODO code application logic here
int kilo = 14;
double minutes = 45.5;
double mile = kilo/1.6;
double hour = minutes/60;
System.out.print("The average speed in miles per hours is:\n"+ mile/hour +" mile/hour");
}
}