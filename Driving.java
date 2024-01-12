import java.awt.Color;
import javax.swing.JFrame;
 
public class Driving
{
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("BluensTD");
        frame.setSize(1280, 720);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel pane = new Panel();
        frame.setContentPane(pane);
        frame.setVisible(true);

    }
}