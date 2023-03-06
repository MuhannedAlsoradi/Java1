//create account1 class
public class Account1 {
    //data field
    private int accountNo;
    private String name;
    private double balance;
    //constructor
    public Account1(int accountNo , String name , double balance){
        this.accountNo=accountNo;
        this.name=name;
        this.balance=balance;
    }
    //methods
    public void print(){
        System.out.println("Your accountNo is "+accountNo);
        System.out.println("Your name is "+name);
        System.out.println("Your balance is "+balance);
        
    }
    public void deposit(int amount){
        
        balance+=amount;

    }
    /*main method*/
    public static void main(String[] args) {
        Account1 a1 =  new Account1(333,"Khalid",300);
        Account1 a2 = new Account1(222,"Ali",200);
        a2.deposit(300);
        a1.print();
        System.out.println("");
        a2.print();
    }
   

    
}
