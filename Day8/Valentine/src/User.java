import java.util.ArrayList;

public class User {
	private String name; //To hold the name of user
	private Country country; //To hold the county to which the user belongs
	private City city; //To hold the city to which the user belongs
	private ArrayList<Brick> ownedBricks; //To hold the bricks that are owned by the user
	private ArrayList<Brick> dedicatedBricks; //To hold the bricks that are dedicated to the user
	
	User(String name, Country country, City city){ //Constructor
		this.name = name;
		this.country = country;
		this.city = city;
		this.ownedBricks = new ArrayList<Brick>();
		this.dedicatedBricks = new ArrayList<Brick>();
	}
	
	public void addBrick(Brick brick) { //To add the brick
		ownedBricks.add(brick);
	}
	
	public String getName() { //To get the name of brick
		return name;
	}
	
	public Country getCountry() { //To get the country to which the user belongs
		return country;
	}
	
	public City getCity() { //To get the city to which the user belongs
		return city;
	}
	
	public ArrayList<Brick> getBricks() { //To get all the bricks owned by user
		return ownedBricks;
	}
	
	public void paintBrick(Brick brick, String caption, String message, User dedicatedUser) { //To paint the brick
		if(ownedBricks.contains(brick)) //If the particular brick is owned by the user, then he/she can edit the brick
			brick.paint(caption, message, dedicatedUser);
		else //If the particular brick is not owned by the user, then he/she cannot edit the brick
			System.out.println("The brick is not owned by this user");
	}
	
	
	/*
	 * User can edit the brick if it is owned by the user
	 */
	public void editBrickCaption(Brick brick, String newCaption) {
		if(ownedBricks.contains(brick))
			brick.editCaption(newCaption);
		else
			System.out.println("The brick is not owned by this user");
	}
	
	public void editBrickMessage(Brick brick, String newMessage) {
		if(ownedBricks.contains(brick))
			brick.editMessage(newMessage);
		else
			System.out.println("The brick is not owned by this user");
	}
	
	public void editBrickDedicatedUser(Brick brick, User newDedicatedUser) {
		if(ownedBricks.contains(brick))
			brick.editDedicatedUser(newDedicatedUser);
		else
			System.out.println("The brick is not owned by this user");
	}
	
	public ArrayList<Brick> getDedicatedBricks(){ //To get all the bricks that are dedicated to the user
		return dedicatedBricks;
	}
	
	public void addDedicatedBrick(Brick brick) { //To add dedicated brick
		dedicatedBricks.add(brick);
	}
	
	public void removeDedicatedBrick(Brick brick) { //To remove dedicated brick
		dedicatedBricks.remove(brick);
	}
}
