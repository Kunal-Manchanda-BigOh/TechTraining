import java.util.*;

public class City {
	private String name; //To hold the name of city
	private ArrayList<Wall> walls; //To hold the walls in a city
	City(String name, ArrayList<Wall> walls){ //Constructor
		this.name = name;
		this.walls = walls;
	}
	
	public String getName() { //To get the name of city
		return name;
	}
	
	public ArrayList<Wall> getWalls() { //To the walls of the city
		return walls;
	}
	
	public int totalNumberOfWallsInitiated() { //To get the total number of walls that are initiated
		int total = 0;
		for(Wall wall: walls) {
			if(wall.isInitiated()) {
				total++;
			}
		}
		return total;
	}
}
