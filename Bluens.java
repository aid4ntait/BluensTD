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
    
    public int getX()
    {
        return xPosition; //refer to old graphic labs for these I think
    }
    public int getY()
    {
        return yPosition;
    }
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
