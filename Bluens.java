public class Bluens 
{
    private int healthPoints;
    private int moveSpeed;
    private int xPosition;
    private int yPosition;
    private int xDestination;
    private int yDestination;
    private double armor;
    private boolean stealth;
    
    
    public Bluens()
    {
        //Bloss is short
    }
    
    public int getXLocation()
    {
        return xPosition;
    }
    public int getYLocation()
    {
        return yPosition;
    }
    private void Path()
    {
        //I write clean code that will get us to destination.  Do not question.ඞ  It will work (prettyplz)
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
