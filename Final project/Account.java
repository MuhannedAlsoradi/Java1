
//create the Account class

//nahal.omar@yahoo.com
public class Account {

    private double balance = 0.0;
   //create a puplic constructor
   public Account(double b) {
       balance = b;

   }
   //create a public method
   public double getBalance() {
       return balance;
   } 
   //create a public method
   public String deposit(double amount){
       balance+=amount;
       
       return "true";
    
   }
   // create a public method
   public String withdraw(double amount){
       if(balance<amount)
           return "false";
       balance-=amount;
        return "true";
   }
   

    
}

