//Our parent class to be copied for all lil cute monkey additions 
public class Monkey
{
    // Monkey stats
    //public static int numOfMonkeys;
    private double bluenDistance;
    private double attackSpeed;
    private int attackRange;
    private int attackDamage;
    private int cost;
    private int xPosition;
    private int yPosition;

    public Monkey(double speed, int damage, int range, int price, int xLocation, int yLocation)
    {
        //numOfMonkeys++;
        this.attackSpeed = speed;
        this.attackRange = range;
        this.attackDamage = damage;
        this.cost = price;

        // added x and y locations so that we can later check in refrence to a balloon to see its distance 

        xPosition = xLocation;
        yPosition = yLocation;
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

    // cost setter and getter
    public int setCost(int newCost)
    {
        cost = newCost;
        return 0;
    }

    public int getCost()
    {
        return cost;
    }

    // setter and getter yPosition
    public int setYPosition(int yLocation)
    {
        yPosition = yLocation;
        return 0;
    }

    public int getYPosition(int yLocation)
    {
        
    }
   

}