import javax.swing.*;
public class GUI2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first GUI");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLocation(500, 210);
        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2");
        frame.add(button1);
        frame.add(button2);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        panel.add(button1); //add the ok button to the panel
        panel.add(button2); //add the cancel button to the panel
        frame.add(panel); 
    }
    
}
