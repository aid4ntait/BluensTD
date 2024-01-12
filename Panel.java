import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel
{
    private Shop market;

    public Panel()
    {
        this.setBackground(Color.GREEN);

        market = new Shop();

        this.add(market);
    }
}