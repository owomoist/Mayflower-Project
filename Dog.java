import mayflower.*;

public class Dog extends AnimatedActor
{
    private Animation walk;
    
    public Dog() 
    {
        String[] allFrames = new String[10];
        for(int i = 1; i < 11; i++)
            allFrames[i - 1] = "img/dog/Walk (" + i + ").png";
        
        walk = new Animation(50, allFrames);
        setAnimation(walk);
        
        walk.scale(200, 194);
        walk.setTransparency(25);
    }
    
    public void act()
    {
        super.act();
    }
}
