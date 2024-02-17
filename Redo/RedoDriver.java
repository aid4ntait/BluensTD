import javax.swing.JFrame;
 
public class RedoDriver
{
    public static void main(String[]args)
    {
        JFrame frame = new JFrame("BluensTD");
        frame.setSize(1920, 1080);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel redo = new GamePanel();
        frame.setContentPane(redo);
        frame.setVisible(true);

    }
}