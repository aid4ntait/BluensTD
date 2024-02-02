import java.util.HashMap;
import java.util.ArrayList;
public class Monkey
{
    // Monkey stats
    //public static int numOfMonkeys;
    //private double bluenDistance;
    private double attackSpeed;
    private int attackRange;
    private int attackDamage;
    private int xPosition;
    private int yPosition;
    private HashMap<String, Integer> monkeysAndCosts; // String is the name and the Integer is the cost of the monkey 

    
    public Monkey(double speed, int damage, int range, int xLocation, int yLocation)
    {
        //numOfMonkeys++;
        this.attackSpeed = speed;
        this.attackRange = range;
        this.attackDamage = damage;
        xPosition = xLocation;
        yPosition = yLocation;

        // stores all the monkeys in a hashmap so later they may be refrenced // currently unused
        monkeysAndCosts = new HashMap<String, Integer>();
        monkeysAndCosts.put("Ninja Monkey", 150 ); // can kill camo, 
        monkeysAndCosts.put("Gattling Gun Monkey", 700); // no bloom
        monkeysAndCosts.put("Dart Monkey", 100); //The basic moneky
        monkeysAndCosts.put("Sniper Monkey", 250); // long range, slow fire, high damage
        monkeysAndCosts.put("Cannon", 300); // hits hard, and slow
        monkeysAndCosts.put("Racoon Monkey", 300); //Consume the bluen.
    }


    public void inRange(ArrayList<Bluens> currentWave)
    {
        // Looks at each individual bluen in the wave and finds if its in range.
        for(int i = 0; i < currentWave.size(); i++) // Iterates through each bluen
        {
            int xdis = this.getX() - currentWave.get(i).getX(); // get xdistance
            int ydis = this.getY() - currentWave.get(i).getY(); // get ydistance
            double distance = Math.sqrt(Math.pow(xdis, 2) + Math.pow(ydis, 2)); // Using pythagorean get distance 
            if(distance <= this.attackRange) // if the distance from the current bluen to the monkey is less than range
            {
                // attack the bluen
                //Create dart: image dart = new ImageIcon(getClass().getResource("/pngsBro/DartAttackPlaceholder.png"));
                //dart png follows bloon until estimated contact, damages, and gets deleted
                break;
            }
        }
        
        
    }
    

    // setter and getter yPosition

    public int setY(int yLocation)
    {
        yPosition = yLocation;
        return 0;
    }

    public int getY()
    {
        return yPosition;
    }

    // setter and getter xPosition

    public int getX()
    {
        return xPosition;
    }

    public int setX(int xLocation)
    {
        xPosition = xLocation;
        return 0;
    }

    // setter and getter attack damage

    public int getDmg()
    {
        return attackDamage;
    }

    public int setDmg(int newDmg)
    {
        attackDamage = newDmg;
        return 0;
    }

    // setter and getter for range

    public int getRng()
    {
        return attackRange;
    }

    public int setRng(int newRng)
    {
        attackRange = newRng;
        return 0;
    }

    // setter and getter for attack speed

    public double getSpd()
    {
        return attackSpeed;
    }

    public double setSpd(double newSpd)
    {
        attackSpeed = newSpd;
        return 0;
    }

    

}