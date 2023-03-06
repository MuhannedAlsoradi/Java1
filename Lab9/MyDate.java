public class MyDate{
    private int day , month , year;
    public MyDate(int day,int month,int year){
        if(day>=1 && day<=31)
          this.day=day;
        else
          day=1;
        if(month>=1 && month<=12)
          this.month=month;
        else
          month=1;  
        this.year=year;
    }
    public void print(){
        System.out.println(day+"/"+month+"/"+year);

    }
    
}
class Employee {
    private String name;
    private double salary;
    private MyDate birthDate;
    public Employee(String name,double salary,MyDate biDate){
        this.name=name;
        this.salary=salary;
        
    }
    public void print(){
        System.out.println("Name is "+name);
        System.out.println("salary is "+salary);
        System.out.println("birthDate is ");
        birthDate.print();
    }
}
public class Test {
    public static void main(String[] args) {
        MyDate d = new MyDate(9, 11, 2003);
        Employee e1 = new Employee("ali", 1200, d);
        Employee e2 = new Employee("Manar", 7500,new MyDate(8, 8, 2003));
        e1.print();
        System.out.println();
        e2.print();
    }
}