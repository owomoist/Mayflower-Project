import mayflower.*;

public class MovableAnimatedActor extends AnimatedActor
{
    private Animation walkRight;
    private Animation idle;
    private Animation idleLeft;
    private Animation walkLeft;
    private Animation fallRight;
    private Animation fallLeft;
    
    private String currentAction;
    private String direction;
    
    public MovableAnimatedActor()
    {
        walkRight = null;
        idle = null;
        currentAction = null;
        fallRight = null;
        fallLeft = null;
        direction = "right";
    }
    
    public void setAnimation(Animation a)
    {
        super.setAnimation(a);
    }
    
    public void setWalkLeftAnimation(Animation ani)
    {
        walkLeft = ani;
        setAnimation(walkLeft);
    }
    
    public void setWalkRightAnimation(Animation ani)
    {
        walkRight = ani;
        setAnimation(walkRight);
    }
    
    public void setIdleAnimation(Animation ani)
    {
        idle = ani;
        setAnimation(idle);
    }
    
    public void setIdleLeftAnimation(Animation ani)
    {
        idleLeft = ani;
        setAnimation(idleLeft);
    }
    
    public void setFallRightAnimation(Animation ani)
    {
        fallRight = ani;
        setAnimation(fallRight);
    }
    
    public void setFallLeftAnimation(Animation ani)
    {
        fallLeft = ani;
        setAnimation(fallLeft);
    }
    
    public void act()
    {
        super.act();
        
        String newAction = null;
        
        if(currentAction == null)
            newAction = "idle";
        
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        // screen 800 x 600
        int rightScreenX = 799 - w;
        int leftScreenX = 1;
        int topScreenY = 1;
        int bottomScreenY = 599 - h;
        
        if(Mayflower.isKeyDown(Keyboard.KEY_RIGHT) && x <= rightScreenX)
        {
            setLocation(x + 1, y);
            newAction = "walkRight";
            if(isBlocked())
                setLocation(x - 1, y);
            direction = "right";
        }
        else if(Mayflower.isKeyDown(Keyboard.KEY_LEFT) && x >= leftScreenX)
        {
            setLocation(x - 1, y);
            newAction = "walkLeft";
            if(isBlocked())
                setLocation(x + 1, y);
            direction = "left";
        }
        else if(Mayflower.isKeyDown(Keyboard.KEY_UP) && y >= topScreenY)
        {
            setLocation(x, y - 1);
            if(isBlocked())
                setLocation(x, y + 1);
        }
        else if(Mayflower.isKeyDown(Keyboard.KEY_DOWN) && y <= bottomScreenY)
        {
            setLocation(x, y + 1);
            if(isBlocked())
                setLocation(x, y - 1);
        }
        else
        {
            newAction = "idle";
            if(direction != null && direction.equals("left"))
            {
                newAction = "idleLeft";
            }
        }
        
        if(isFalling())
        {
            if(direction.equals("right"))
                newAction = "fallRight";
            else if(direction.equals("left"))
                newAction = "fallLeft";
        }
        
        if(newAction != null && !newAction.equals(currentAction))
        {
            if(newAction.equals("idle"))
                setAnimation(idle);
            else if(newAction.equals("idleLeft"))
                setAnimation(idleLeft);
            else if(newAction.equals("walkRight"))
                setAnimation(walkRight);
            else if(newAction.equals("walkLeft"))
                setAnimation(walkLeft);
            else if(newAction.equals("fallRight"))
                setAnimation(fallRight);
            else if(newAction.equals("fallLeft"))
                setAnimation(fallLeft);
            currentAction = newAction;
        }
    }
}
