//create the Customer class
public class Customer {
    //Data field ...
   private String firstname;
   private String lastname;
   private Account account;
   //create a public constructor
   public Customer(String first,String last ){
       firstname = first;
       lastname = last;

   }
   //create two public accessors
   public String getFirstName() {
       return firstname;
   }
   public String getLastName() {
       return lastname;
   }
   //create two methods for account
   public void setAccount(Account acc) {
         account = acc;
   }
   public Account getAccount() {
       return account;
   }
    
}
