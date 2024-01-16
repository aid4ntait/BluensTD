import java.util.HashMap;

public class Monkey
{
    // Monkey stats
    //public static int numOfMonkeys;
    private double bluenDistance;
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

        // stores all the monkeys in a hashmap so later they may be refrenced 
        monkeysAndCosts = new HashMap<String, Integer>();
        monkeysAndCosts.put("Ninja Monkey", 150 );
        monkeysAndCosts.put("Gattling Gun Monkey", 700);
        monkeysAndCosts.put("Dart Monkey", 100);
        monkeysAndCosts.put("Sniper Monkey", 250);
        monkeysAndCosts.put("Cannon", 300);
    }

    public void inRange()
    {
        //later calculate distance
        /*while(dist < attackRange)
        {
            attack();
            wait(); ඞ
        } */
    }
    public void attack()
    {
        // find the closest bluen and hit them for attackDamage
    }

    // setter and getter yPosition
    public int setYPosition(int yLocation)
    {
        yPosition = yLocation;
        return 0;
    }

    public int getYPosition()
    {
        return yPosition;
    }

    // setter and getter xPosition

    public int getXPosition()
    {
        return xPosition;
    }

    public int setXPosition(int xLocation)
    {
        xPosition = xLocation;
        return 0;
    }
   

}