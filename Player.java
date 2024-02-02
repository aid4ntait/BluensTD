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

    // getter and setter for balance

    public int getBalance()
    {
        return balance;
    }

    public int setBalance(int newMoney)
    {
        balance = newMoney;
        return 0;
    }

    // getter and setter for health points

    public int getHealthPoints()
    {
        return healthPoints;
    }

    public int setHealthPoints(int newHealth)
    {
        healthPoints = newHealth;
        return 0;
    }
}
