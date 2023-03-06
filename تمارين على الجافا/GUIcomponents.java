import javax.swing.*;
public class GUIcomponents {
    public static void main(String[] args) {
        //create a button with text ok
        JButton jbtOK = new JButton("OK");
        //create a button with text cancel
        JButton jbtCancel = new JButton("Cancel");
        //create a label with text ...
        JLabel jbName = new JLabel("Enter your name: ");
        //create a text field with text ...
        JTextField jtfName = new JTextField("Type Name here: ");
        //create a check box with text ...
        JCheckBox jchkBold = new JCheckBox("Bold");
        //create a chek box with text ...
        JCheckBox jchkItalic = new JCheckBox("Italic");
        //create a radio button with text ...
        JRadioButton jrbRed = new JRadioButton("Red");
        //create a radio button with text ...
        JRadioButton jrbYellow = new JRadioButton("Yellow");
        //create a combo box with several choises ...
        JComboBox jcboColor = new JComboBox<>(new String[]{
            "Freshman","sophomore","Junior","Senior"});
        //create a panel to group components
        JPanel panel = new JPanel();
        panel.add(jbtOK); //add the ok button to the panel
        panel.add(jbtCancel); //add the cancel button to the panel
        panel.add(jbName); //add the label to the panel
        panel.add(jtfName); // add the text field to the panel
        panel.add(jchkBold); //add the chek box to the panel
        panel.add(jchkItalic); //add the chek box to the panel
        panel.add(jrbRed); //add the radio button to the panel
        panel.add(jrbYellow); //add the radio button to the panel
        panel.add(jcboColor); //add the compo box to the panel

        JFrame frame = new JFrame(); //create a frame 
        frame.add(panel); //add the panel to the frame
        frame.setTitle("Show graphical user interface Components ");
        frame.setSize(450,100);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}