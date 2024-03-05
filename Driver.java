
import javax.swing.JFrame;
 
public class Driver
{
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("BluensTD");
        frame.setSize(1920, 1080);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel pain = new GamePanel();
        frame.setContentPane(pain);
        frame.setVisible(true);

    }
}