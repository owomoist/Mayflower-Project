import mayflower.*;

public class Jack extends AnimatedActor
{
    private Animation walk;
    
    public Jack() 
    {
        String[] allFrames = new String[7];
        for(int i = 1; i < 8; i++)
            allFrames[i - 1] = "img/jack/Walk (" + i + ").png";
        
        walk = new Animation(50, allFrames);
        setAnimation(walk);
        
        walk.scale(50, 44);
        walk.setTransparency(80);
    }
    
    public void act()
    {
        super.act();
    }
}
