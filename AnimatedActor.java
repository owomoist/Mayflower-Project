
/**
 * Write a description of class AnimatedActor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import mayflower.*;

public class AnimatedActor extends GravityActor
{
    
    private Animation animation;
    private Timer animationTimer;
    
    public AnimatedActor() 
    {
        animationTimer = new Timer(60000000); // 80000000
    }
    
    public void setAnimation(Animation a)
    {
        animation = a;
    }
    
    public void act()
    {
        super.act();
        if(animationTimer.isDone() && animation != null)
        {
            MayflowerImage next = animation.getNextFrame();
            setImage(next);
            animationTimer.reset();
        }
    }
}
