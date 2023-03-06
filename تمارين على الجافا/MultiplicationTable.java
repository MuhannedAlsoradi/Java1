import javax.swing.*;
public class MultiplicationTable {
    public static void main(String[] args){
        String output = "                Multiplication Table\n";   
        output += "    -------------------------------------------\n";
        output +="   | ";
        for(int i=1;i<=9;++i)
          output +="    "+i;
          output+="\n";
        for(int j=1;j<=9;++j){
          output +=j+" | ";
        for(int i=1;i<=9;++i){

            if(i*j<10)
            output +="    "+(i*j);
            else
            output +="  "+(i*j); 

        }
        output +="\n";       
    }

       
      JOptionPane.showMessageDialog(null, output); }}


