import javax.swing.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.image.*;

public class RedoGamePanel extends JPanel{
    private MonkeyZone monkeyPanel;
    private Timer time; 
    private int timerDelay = 24;
}


class MonkeyZone extends JPanel{
    private BufferedImage myImage;
    private Graphics myBuffer;

    public void stepAnimation()
    {
        //for each ->
        //Monkey.draw(myBuffer);
    }

    public void paintComponent(Graphics g)
    {
        g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
    }
}

