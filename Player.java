public class Player 
{
    // local variables 
    public static int balance;
    public static int healthPoints;

    
    public Player()
    {
        balance = 300;
        healthPoints = 10;
    }

    public static int getBalance()
    {
        return balance;
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

    public static int setBalance(int newMoney)
    {
        balance = newMoney;
        return 0;
    }
}
