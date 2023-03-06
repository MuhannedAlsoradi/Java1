import javax.swing.JOptionPane;
public class Sum {
   public Sum()
   {

   }  
   public static void main(String[] args){
       String firstNumber = JOptionPane.showInputDialog("Enter first number");
       int number1 = Integer.parseInt(firstNumber);
       String secondNumber = JOptionPane.showInputDialog("Enter second number");
       int number2 = Integer.parseInt(secondNumber);
       int sum = number1+number2;
       JOptionPane.showMessageDialog(null, "The sum is : "+ sum);
              

   }


   
}
