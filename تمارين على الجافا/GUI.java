import javax.swing.JFrame;
public class GUI {
    public static void main(String[] args) {
        javax.swing.JFrame frame1 = new javax.swing.JFrame();
        frame1.setTitle("Window 1");
        frame1.setSize(200,150);
        frame1.setLocation(200,100);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

        javax.swing.JFrame frame2 = new javax.swing.JFrame();
        frame1.setTitle("Window 2");
        frame1.setSize(200,150);
        frame1.setLocation(410,100);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
    }
}
