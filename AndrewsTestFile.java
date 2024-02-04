import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


// this is a temp file that I made so that I could test how we could use other layouts to try to fix our little shop panel issue -Andrew 
public class AndrewsTestFile extends JPanel
{

    // temp variabels 
    GridBagLayout griddy;
    GridBagConstraints gbc;

    //local objects 
    private ShopPanel shop;
    private JPanel monkeyZone; // invisible panel of same dimensions of the GamePanel 

    //Wave handling stuff
    private int currentWave = 0;
    private int bluenCount = 10;


    //Making all of the other classes exist so we can pass them through to each other
    private Bluens bluens;
    private Player player;
    private ScoreboardPanel scorePanel;

    ArrayList<Bluens> wave = new ArrayList<Bluens>();
    

    public AndrewsTestFile()
    { 
        player = new Player(); 
        bluens = new Bluens(player);
        griddy = new GridBagLayout();
        gbc = new GridBagConstraints();

        this.setLayout(griddy);
        this.setBackground(Color.GREEN.darker());

        monkeyZone = new JPanel(); 
        monkeyZone.setBackground(Color.RED);

        JButton button1 = new JButton("bw;er");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipady = 40;
        this.add(button1, gbc);

        JButton button2 = new JButton("asdf");
        gbc.gridx = 1;
        gbc.gridy = 6;
        this.add(button2, gbc);

        JButton button3 = new JButton("alkjsdhf");
        gbc.gridx = 1;
        gbc.gridy = 11;
        this.add(button3, gbc);

        JButton button4 = new JButton(";alksjdf");
        gbc.gridx = 1;
        gbc.gridy = 16;
        this.add(button4, gbc);

        JButton button5 = new JButton("a;kjlshdf");
        gbc.gridx = 1;
        gbc.gridy = 21;
        this.add(button5, gbc);


        shop = new ShopPanel(player);
        //this.add(shop);
        shop.setVisible(true);
        shop.setBackground(Color.BLACK);
        
    }
    
    public static void addMonkey(int speed, int range, int damage, int x, int y)
    {
        Monkey moneky = new Monkey(speed, damage, range, x, y);
    }
    
    
    private static void waveHandler(int currentWave, int bluenCount)
    {
        //Stuff to trigger the next wave
        int previousWaveCounter = 0;
        int tempBluenCount = bluenCount; //makes it so we can easily increment, while also judging wave progress by bluens killed
        if(bluenCount == 0)
        {
            previousWaveCounter = currentWave;
            currentWave += 1;
        }

        if(currentWave > previousWaveCounter)
        {
            Player.balance += 100;
            bluenCount += tempBluenCount - (5 * currentWave);
        }
    }
}

