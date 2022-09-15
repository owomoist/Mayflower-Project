
import mayflower.*;

public class Animation
{
    private int framerate;
    private MayflowerImage[] frames;
    private int currentFrame;
    
    public Animation(int f, String[] filenames)
    {
        framerate = f;
        
        frames = new MayflowerImage[filenames.length];
        for(int i = 0; i < filenames.length; i++)
        {
            MayflowerImage current = new MayflowerImage(filenames[i]);
            frames[i] = current;
        }
        
        currentFrame = 0;
    }
    
    public int getFrameRate()
    {
        return framerate;
    }
    
    public MayflowerImage getNextFrame()
    {
        if(currentFrame >= frames.length)
            currentFrame = 0;
        MayflowerImage current = frames[currentFrame];
        currentFrame++;
        return current;
    }
    
    public void scale(int w, int h)
    {
        for(int i = 0; i < frames.length; i++)
        {
            frames[i].scale(w, h);
        }
    }
    
    public void setTransparency(int percent)
    {
        for(int i = 0; i < frames.length; i++)
        {
            frames[i].setTransparency(percent);
        }
    }
    
    public void mirrorHorizontally()
    {
        for(int i = 0; i < frames.length; i++)
        {
            frames[i].mirrorHorizontally();
        }
    }
    
    public void setBounds(int x, int y, int w, int h)
    {
        for(int i = 0; i < frames.length; i++)
        {
            frames[i].crop(x, y, w, h);
        }
    }
}
