import java.util.Scanner;
//test class ...
public class OOP {
             /*main method*/
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name :");
        String fname = input.next();
        System.out.println("Enter the last name :");
        String lname = input.next();
        System.out.println("Enter the monthly salary :");
        double s = input.nextDouble();
        //objects ...
        OPP2 emp1 = new OPP2(fname,lname,s);
        System.out.print("The yearly salary of "+emp1.getFirstName()+" "+emp1.getLastName());
        System.out.println(" is "+emp1.getSalary()*12);
        double newSalary = emp1.getSalary()*0.1+emp1.getSalary();
        emp1.setSalary(newSalary);
        System.out.println("The yearly salary is "+emp1.getSalary()*12);
    }
    
}
//class ...
 class OPP2 {
     //data fields ...
    String firstName ;
    String lastName ;
    double salary ;
    //behavoir ...
    OPP2(String f , String l , double s){
        firstName = f;
        lastName = l;
        salary = s;

    }
    //get & set methods ...
    public void setFirstName(String fname) {
        firstName = fname;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lname) {
        lastName = lname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setSalary(double s) {
        salary = s;
    }
    public double getSalary() {
        return salary;
    }
    


}
