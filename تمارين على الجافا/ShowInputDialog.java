import java.text.ParsePosition;

import javax.swing.*;
public class ShowInputDialog {
    public ShowInputDialog()
    {

    }
    public static void main(String[] args){
    int number1 = (int)(Math.random()*10);
    int number2 = (int)(Math.random()*10);
    if(number1<number2)
    {
        int temp = number1;
        number1 = number2;
        number2 = temp;
    }
    String sanswer = JOptionPane.showInputDialog("What is " + number1 + "-" + number2 + "?");
    int answer = Integer.parseInt(sanswer);
    if(answer == number1 - number2)
      JOptionPane.showMessageDialog(null,"You are correct!");
    else 
      JOptionPane.showMessageDialog(null, "the right answer should be " + (number1-number2));

    }

    
}
