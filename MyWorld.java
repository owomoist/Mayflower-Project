import mayflower.*;


public class MyWorld extends World {

	private Cat cat;
	private Dog dog;
	private Jack jack;
	
    public MyWorld() 
    {
    	setBackground("img/BG/BG.png");
    	
    	cat = new Cat();
    	addObject(cat, 400, 100);
    	
    	dog = new Dog();
    	addObject(dog, 500, 100);
    	
    	jack = new Jack();
    	addObject(jack, 700, 100);
    	
    	addObject(new Block(), 400, 500);
    	addObject(new Block(), 528, 372);
    	
    	Mayflower.showBounds(true);
    }
    
    public void act()
    {
    }
    
}