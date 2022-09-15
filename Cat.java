import mayflower.*;

public class Cat extends MovableAnimatedActor
{
    private Animation walk;
    private Animation idle;
    private Animation idleLeft;
    private Animation walkLeft;
    private Animation fallRight;
    private Animation fallLeft;
    
    public Cat() 
    {
        // walk right
        String[] walkFrames = new String[10];
        for(int i = 1; i < 11; i++)
            walkFrames[i - 1] = "img/cat/Walk (" + i + ").png";
        
        walk = new Animation(50, walkFrames);
        setWalkRightAnimation(walk);
        
        walk.scale(100, 87);
        walk.setTransparency(50);
        walk.setBounds(18, 5, 54, 80);
        
        // walk left
        String[] walkLeftFrames = new String[10];
        for(int i = 1; i < 11; i++)
            walkLeftFrames[i - 1] = "img/cat/Walk (" + i + ").png";
        
        walkLeft = new Animation(50, walkLeftFrames);
        setWalkLeftAnimation(walkLeft);
        
        walkLeft.scale(100, 87);
        walkLeft.setTransparency(50);
        walkLeft.mirrorHorizontally();
        walkLeft.setBounds(28, 5, 54, 80);
        
        // idle
        String[] idleFrames = new String[10];
        for(int i = 1; i < 11; i++)
            idleFrames[i - 1] = "img/cat/Idle (" + i + ").png";
        
        idle = new Animation(50, idleFrames);
        setIdleAnimation(idle);
        
        idle.scale(100, 87);
        idle.setTransparency(50);
        idle.setBounds(18, 5, 54, 80);
        
        // idle left
        String[] idleLeftFrames = new String[10];
        for(int i = 1; i < 11; i++)
            idleLeftFrames[i - 1] = "img/cat/Idle (" + i + ").png";
        
        idleLeft = new Animation(50, idleLeftFrames);
        setIdleLeftAnimation(idleLeft);
        
        idleLeft.scale(100, 87);
        idleLeft.setTransparency(50);
        idleLeft.mirrorHorizontally();
        idleLeft.setBounds(28, 5, 54, 80);
        
        // fall right
        String[] fallRightFrames = new String[8];
        for(int i = 1; i < 9; i++)
            fallRightFrames[i - 1] = "img/cat/Fall (" + i + ").png";
        
        fallRight = new Animation(50, fallRightFrames);
        setFallRightAnimation(fallRight);
        
        fallRight.scale(100, 87);
        fallRight.setTransparency(50);
        fallRight.setBounds(13, 3, 53, 81); // change
        
        // fall left
        String[] fallLeftFrames = new String[8];
        for(int i = 1; i < 9; i++)
            fallLeftFrames[i - 1] = "img/cat/Fall (" + i + ").png";
        
        fallLeft = new Animation(50, fallLeftFrames);
        setFallLeftAnimation(fallLeft);
        
        fallLeft.scale(100, 87);
        fallLeft.setTransparency(50);
        fallLeft.mirrorHorizontally();
        fallLeft.setBounds(33, 3, 53, 81); // change
    }
    
    public void act()
    {
        super.act();
    }
}
