//create the Bank class
public class Bank {
    public final int MAX = 100;
     //create array of objects
     Customer[] customer = new Customer[MAX];
    //Data field ...
    private static int numberOfCustomer = 0;
    //create getnumberOfCustomer method
    public static int getnumberOfCustomer(){
        return numberOfCustomer;
    }
    //create add custmer method
    public void addCustomer(String fName , String lName){
        customer[ Bank.getnumberOfCustomer() ] = new Customer(fName, lName);
        numberOfCustomer++;
    }
    //create get customer method
    public Customer getCustomer(int index) {
        return customer[index];
    }
}
