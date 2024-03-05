
import javax.swing.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.image.*;
public class GamePanel extends JPanel
{
    public static MonkeyZone monkeyZone;
    private Timer time; 
    private int timerDelay;
    private BufferedImage myImage;
    private BorderLayout borderLayout;
    public static ArrayList<Monkey> monkeys = new ArrayList<Monkey>();
    public GamePanel(){
        //timerDelay = 10;
        ImageIcon dart = new ImageIcon(getClass().getResource("/pngsBro/DartMonkey.png"));

        monkeyZone = new MonkeyZone();
        borderLayout = new BorderLayout();
        this.setLayout(borderLayout);
        time = new Timer(10, new Listener());
        monkeyZone.setBackground(Color.GREEN.darker());
        
        Monkey moneky = new Monkey("dart", 100, 100, dart );
        monkeys.add(moneky);
        this.add(monkeyZone, BorderLayout.CENTER);
        monkeyZone.stepAnimation();
    }
    private class Listener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            monkeyZone.stepAnimation();
        }
    } 
}

class MonkeyZone extends JPanel{
    
    private BufferedImage myImage;
    private Graphics myBuffer;
    private ArrayList<Monkey> monkeys = GamePanel.monkeys;
    public static final int N = 400;
    public MonkeyZone()
    {
        myImage =  new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
        myBuffer = myImage.getGraphics();
    }
    public void stepAnimation()
    {
        myBuffer.setColor(Color.green.darker());
        myBuffer.fillRect(0,0,1000,1000); 
        //for each monkey ->
        //Monkey.draw(myBuffer);
        
        if(monkeys.size() > 0)
        {
            System.out.println(1);
            for(int i = 0; i < monkeys.get(0).getNumOfMonkeys(); i++)
            {
                System.out.println(monkeys.get(i).toString());
                monkeys.get(i).draw(myBuffer);
            }
        }
        else{
            // don't know what to do here
        }
        //myBuffer.drawImage(new ImageIcon(getClass().getResource("/pngsBro/NinjaMonkey.png")).getImage(), 100, 100, 25, 25, null); 
        repaint();

    }
    private class Mouse extends MouseAdapter
    {
        MonkeyZone monkeyZone = GamePanel.monkeyZone;
        ImageIcon dart = new ImageIcon(getClass().getResource("/pngsBro/DartMonkey.png"));

        public void mousePressed(MouseEvent e)
        {
            Monkey moneky = new Monkey("dart", e.getX(), e.getY(), dart );

            monkeyZone.stepAnimation();
        }
    }

    public void paintComponent(Graphics g)
    {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }
}

