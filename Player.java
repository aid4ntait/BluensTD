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

    public void setBalance(int newMoney)
    {
        balance = newMoney;
    }

    // getter and setter for health points

    public int getHealthPoints()
    {
        return healthPoints;
    }

    public void setHealthPoints(int newHealth)
    {
        healthPoints = newHealth;
    }
}
