public class Bluens 
{
    private int healthPoints;
    private int moveSpeed;
    private int xPosition;
    private int yPosition;
    private int xDestination;
    private int yDestination;
    private int killValue; // money on death
    private double armor;
    private boolean stealth;
    
    
    public Bluens(Player player)
    {
        //Bloss is short
        //what goes here tho
    }

    // setter and getter for x
    
    public int getX()
    {
        return xPosition;
    }

    public int setX(int newX)
    {
        xPosition = newX; 
        return 0;
    }

    //setter and getter for y

    public int getY()
    {
        return yPosition;
    }

    public int setY(int newY)
    {
        yPosition = newY;
        return 0;
    }

    //setter and getter for health points

    public int getHealthPoints()
    {
        return healthPoints;
    }

    public int setHealthPoints(int newHP)
    {
        healthPoints = newHP;
        return 0;
    }

    //setter and getter for move speed

    public int getSpd()
    {
        return moveSpeed;
    }

    public int setSpd(int newSpd)
    {
        moveSpeed = newSpd;
        return 0;
    }

    //setter and getter for xDestination

    public int getXDestination()
    {
        return xDestination;
    }

    public int setXDestination(int newDestination)
    {
        xDestination = newDestination;
        return 0;
    }

    //setter and getter for yDestination

    public int getYDestination()
    {
        return yDestination;
    }

    public int setYDestination(int newYDestination)
    {
        yDestination = newYDestination;
        return 0;
    }

    //setter and getter for killValue

    public int getKillValue()
    {
        return killValue;
    }

    public int setKillValue(int newKillValue)
    {
        killValue = newKillValue;
        return 0;
    }

    //setter and getter for armor 
    public double getArmor()
    {
        return armor;
    }

    public double setArmor(int newArmor)
    {
        armor = newArmor;
        return 0;
    }
    
    //setter and getter for stealth

    public boolean hasStealthTrue(boolean stealth)
    {
        return stealth = true;
    }

    public boolean hasStealthFalse(boolean stealth)
    {
        return stealth = false;
    }

    //SEPERATE into seperate goals e.g. : path1 goes right 300 units, path2 goes up 20, path3 left 400, ect
    private void Path()
    {
        //I write clean code that will get us to destination.  Do not question.  It will work (prettyplz)
        while(xPosition != xDestination || yPosition != yDestination)
        {
            //If Desination > Position, go to it, & vise versa. For both x & y
            if(xDestination > xPosition)
            {
                xPosition += moveSpeed;
            }
            else if(xDestination < xPosition)
            {
                xPosition -= moveSpeed;
            }

            if(yDestination > yPosition)
            {
                yPosition += moveSpeed;
            }
            else if(yDestination < yPosition)
            {
                yPosition -= moveSpeed;
            }
        }
    }
}
