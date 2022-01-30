import java.util.*;

public class Wall {
	private String name; //To hold the name of the wall
	private ArrayList<Brick> bricks; //To hold the bricks in a wall
	private int maxPaintedBricks = 90; //To hold the max bricks in a wall
	Wall(String name){ //Constructor
		this.name = name;
		this.bricks = new ArrayList<Brick>();
	}
	
	public void addBrick(Brick brick) {
		this.bricks.add(brick);
	}
	
	public boolean reachedMax() { //Returns true if whole wall is occupied
		ArrayList<Brick> unPaintedBricks = new ArrayList<Brick>();
		for(Brick brick: bricks) {
			if(!brick.getIsPainted()) {
				unPaintedBricks.add(brick);
			}
		}
		return !(unPaintedBricks.size() < maxPaintedBricks);
	}
	
	
	public boolean isInitiated() { //To tell whether the wall is initiated or not
		ArrayList<Brick> unPaintedBricks = new ArrayList<Brick>();
		for(Brick brick: bricks) {
			if(!brick.getIsPainted()) {
				unPaintedBricks.add(brick);
			}
		}
		return !(unPaintedBricks.size() == bricks.size());
	}
	
	public int totalNumberOfBricksInitiated() { //To get the total number of bricks that are initiated
		int total = 0;
		for(Brick brick: bricks) {
			if(brick.getIsPainted()) {
				total++;
			}
		}
		return total;
	}
}
