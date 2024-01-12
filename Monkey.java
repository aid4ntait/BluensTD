public class Monkey
{
    // Monkey stats
    //public static int numOfMonkeys;
    private int attackRange;
    private double attackSpeed;
    private int attackDamage;
    private int cost;
    private int x;
    private int y;

    public Monkey(double speed, int damage, int range, int cst, int xLocation, int yLocation)
    {
        //numOfMonkeys++;
        attackSpeed = speed;
        attackRange = range;
        attackDamage = damage;
        cost = cst;

        // added x and y locations so that we can later check in refrence to a balloon to see its distance 

        x = xLocation;
        y = yLocation;
    }

    public void inRange()
    {
        //late calculate distance
        /*while(dist < attackRange)
        {
            attack();
            wait();
        } */
    }
    public void attack()
    {
        // find the closest bloon and hit them for attackDamage
    }
   

}