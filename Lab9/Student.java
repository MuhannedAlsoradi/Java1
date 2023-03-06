//create the student class
public class Student{
    //data field
    private int id;
    private String firstName;
    private String lastName;
    private double avg;
    
  

    //constructors
    public Student(){
        this(0, null, null, 0);
    }
    public Student(int id , String fName , String lName , double a){
        this.id=id;
        firstName=fName;
        lastName=lName;
        avg=a;

    }
  

    public static int findMax(Student std[]){
        int index = 0;
        double maxAvg = std[0].getAvg();
        int i=1;
        for(;i<std.length;++i)
          if(std[i].getAvg()>maxAvg)
            maxAvg = std[i].getAvg();
                 index = i;
        return i;
    }
    //create the set&get methods
    public double getAvg() {
        return avg;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

public static void main(String[] args) {
   
    Student s1 = new Student(222,"Ali","khalid",88.7);
    Student s2 = new Student(333,"Hani","alzared",90.5);
    Student s3 = new Student(444,"Haneen","Alsoradi",73.7);
    Student s4 = new Student(555,"Dina","Hothot",93);
    Student s5 = new Student(666,"Kamal","Radi",66.9);

    Student std[] = new Student[5];

    System.out.println("The first student :");
    System.out.println("Your id is "+s1.getId());
    System.out.println("Your name is "+s1.getFirstName()+" "+s1.getLastName());
    System.out.println("Your Average is "+s1.getAvg());
    s1.setFirstName("Muhanned");
    System.out.println("After modifying "+s1.firstName); 
    System.out.println(" ");
    System.out.println("The second student :");
    System.out.println("Your id is "+s2.getId());
    System.out.println("Your name is "+s2.getFirstName()+" "+s1.getLastName());
    System.out.println("Your Average is "+s2.getAvg());
    System.out.println(" ");
    System.out.println("The third student :");
    System.out.println("Your id is "+s3.getId());
    System.out.println("Your name is "+s3.getFirstName()+" "+s1.getLastName());
    System.out.println("Your Average is "+s3.getAvg());
    System.out.println(" ");
    System.out.println("The fourth student :");
    System.out.println("Your id is "+s4.getId());
    System.out.println("Your name is "+s4.getFirstName()+" "+s1.getLastName());
    System.out.println("Your Average is "+s4.getAvg());
    System.out.println(" ");
    System.out.println("The fifth student :");
    System.out.println("Your id is "+s5.getId());
    System.out.println("Your name is "+s5.getFirstName()+" "+s1.getLastName());
    System.out.println("Your Average is "+s5.getAvg());
    System.out.println(" ");

} }