import mayflower.*;

public class GravityActor extends Actor
{
    public GravityActor()
    {
        
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 1);
        if(isBlocked())
            setLocation(getX(), getY() - 1);
    }
    
    public boolean isBlocked()
    {
        return isTouching(Block.class);
    }
    
    public boolean isFalling()
    {
        boolean ret;
        // move actor down and see if it touches a block
        setLocation(getX(), getY() + 1);
        ret = isBlocked();
        setLocation(getX(), getY() - 1);
        return !ret;
    }

}
