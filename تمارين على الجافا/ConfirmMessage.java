import javax.swing.*;
public class ConfirmMessage {

    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null,"Continue?");
        if(option==0)
          JOptionPane.showMessageDialog(null, "Yes");
        else if(option==1)
          JOptionPane.showMessageDialog(null, "No");
        else 
          JOptionPane.showMessageDialog(null, "Cancel");  
    }
}