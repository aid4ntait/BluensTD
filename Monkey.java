public class Monkey
{
    // Monkey stats
    //public static int numOfMonkeys;
    private int attackRange;
    private double attackSpeed;
    private int attackDamage;
    private int cost  = 100;

    public void Monkey()
    {
        //numOfMonkeys++;
        attackDamage = 30;
        attackSpeed = 1.00;
        
    }
    public void inRange()
    {
        //late calculate distance
        while(dist < attackRange)
        {
            attack();
            wait();
        }
    }
    public void attack()
    {
        // find the closest bloon and hit them for attackDamage
    }
   

}