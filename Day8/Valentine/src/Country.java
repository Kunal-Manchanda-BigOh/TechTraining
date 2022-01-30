import java.util.*;

public class Country {
	private String name; //To hold the country name
	private ArrayList<City> cities; //To hold the cities in a country
	Country(String name, ArrayList<City> cities){ //Constructor
		this.name = name;
		this.cities = cities;
	}
}
