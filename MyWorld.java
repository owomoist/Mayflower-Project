import mayflower.*;


public class MyWorld extends World {

    private Cat cat;
    private String[][] tiles;
    private TitleScreen titleScreen;
    
    public MyWorld() 
    {
        tiles = new String[6][8];
        
        setBackground("img/BG/BG.png");
        
        cat = new Cat();
        
        showText("Welcome to Very Creative Game", 400, 280, Color.RED);
        showText("Press Space to Start", 400, 320, Color.RED);
        
        Mayflower.showBounds(true);
    }
    
    public void buildWorld()
    {
        for(int r = 0; r < tiles.length; r++)
            for(int c = 0; c < tiles[r].length; c++)
                tiles[r][c] = "";
                
        for(int i = 0; i < tiles[4].length; i++)
            tiles[4][i] = "ground";
            
        for(int r = 0; r < tiles.length; r++)
            for(int c = 0; c < tiles[r].length; c++)
                if(tiles[r][c].equals("ground"))
                    addObject(new Block(), c * 100, (r + 1) * 100);
    }
    
    public void act()
    {
        while(!Mayflower.isKeyDown(Keyboard.KEY_SPACE))
        if(Mayflower.isKeyDown(Keyboard.KEY_SPACE))
        {
            buildWorld();
            addObject(cat, 400, 100);
        }
    }
    
}