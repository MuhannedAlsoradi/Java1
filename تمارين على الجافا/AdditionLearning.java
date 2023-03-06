import javax.swing.*;
public class AdditionLearning {
    public AdditionLearning()
    {

    }
       public static void main(String[] args){
          
          int number1 = (int)(System.currentTimeMillis()%10);
          int number2 = (int)(System.currentTimeMillis()*7%10);
          String sanswer = JOptionPane.showInputDialog(number1 + "+" +  number2 + "= ?");
          int answer = Integer.parseInt(sanswer);
          JOptionPane.showMessageDialog(null,"The answer is : " + (answer==(number1+number2)));
          int true1 = 0 , false1 = 0;
          if ((answer==(number1+number2))) 
            true1+=1;
          else 
            false1+=1;
          JOptionPane.showMessageDialog(null, "True answers :" + true1 + "\nFalse answers :" + false1  );
        
          

    
       }

}
