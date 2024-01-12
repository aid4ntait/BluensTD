public class Player 
{
    private static int currentMoney;
    private static int healthPoints;

    public Player()
    {
        currentMoney = 300;
        healthPoints = 10;
    }


    public static int getMoney()
    {
        return currentMoney;
    }

    public static int getHP()
    {
        return healthPoints;
    }

    public static int setHP(int newHealth)
    {
        healthPoints = newHealth;
        return 0;
    }

    public static int setMoney(int newMoney)
    {
        currentMoney = newMoney;
        return 0;
    }
}
