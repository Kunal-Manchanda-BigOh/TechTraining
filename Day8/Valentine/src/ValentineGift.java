import java.util.*;

public class ValentineGift {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int numberOfUsers = sc.nextInt();
		
		/*
		 * To hold the indian cities
		 */
		ArrayList<City> indianCities = new ArrayList<City>(Arrays.asList(
				new City("Delhi", new ArrayList<Wall>(Arrays.asList(new Wall("Wall1"), new Wall("Wall2")))),
				new City("Mumbai", new ArrayList<Wall>(Arrays.asList(new Wall("Wall1"), new Wall("Wall2"))))
		));
		
		/*
		 * To hold all the countries
		 */
		ArrayList<Country> countries = new ArrayList<Country>(Arrays.asList(new Country("India", indianCities)));
		
		
		/*
		 * To hold all the names of the users
		 */
		ArrayList<String> userNames = new ArrayList<String>();
		for(int iterator=0; iterator<numberOfUsers; iterator++) {
			System.out.println("Enter the name of user:");
			userNames.add(sc.next());
		}
		
		/*
		 * To hold the list of users
		 */
		ArrayList<User> listOfUsers = new ArrayList<User>();
		for(String name: userNames) {
			listOfUsers.add(new User(name, countries.get(0), indianCities.get(0)));
		}
		
		for(User user: listOfUsers) {
			System.out.println("Enter the number of bricks to be owned by:" + user.getName());
			int numberOfBricks = sc.nextInt();
			for(int iterator=0; iterator<numberOfBricks; iterator++) {
				Brick brick = new Brick(user);
				ArrayList<Wall> walls = user.getCity().getWalls(); //Getting the walls of the user's city
				for(Wall wall: walls) {
					if(!wall.reachedMax())
						wall.addBrick(brick);
				}
				displayAllUsers(user, listOfUsers);
				System.out.println("Enter the user name to dedicate brick " + (iterator+1));
				String dedicatedUserName = sc.next();
				User dedicatedUser = getUser(dedicatedUserName, listOfUsers);
				System.out.println("Enter the caption to be painted on the brick for " + dedicatedUser.getName());
				String caption = sc.next();
				System.out.println("Enter the message to be painted on the brick for " + dedicatedUser.getName());
				String message = sc.next();
				brick.paint(caption, message, dedicatedUser);
				user.addBrick(brick);
			}
		}
	}
	
	/*
	 * To display all users except the current user
	 */
	public static void displayAllUsers(User currentUser, ArrayList<User> allUsers) {
		System.out.println("All Users:");
		for(User user: allUsers) {
			if(!user.getName().equals(currentUser.getName()))
				System.out.println(user.getName());
		}
	}
	
	/*
	 * To get the particular user
	 */
	public static User getUser(String name, ArrayList<User> listOfUsers) {
		User ans = null;
		for(User user: listOfUsers) {
			if(user.getName().equals(name)) {
				ans = user;
			}
		}
		return ans;
	}
	
	/*
	 * To find the hottest guy or girl who hold the maximum number
	 * of dedications
	 */
	public static User findHottestGuyOrGirl(ArrayList<User> listOfUsers) {
		User hottest = null;
		int max = listOfUsers.get(0).getDedicatedBricks().size();
		for(User user: listOfUsers) {
			if(user.getDedicatedBricks().size() > max) {
				hottest = user;
				max = user.getDedicatedBricks().size();
			}
		}
		return hottest;
	}
	
	/*
	 * To find the user who did not got any dedication
	 */
	public static User userWhoDidNotGetAnyDedidication(ArrayList<User> listOfUsers) {
		User ans = null;
		for(User user: listOfUsers) {
			if(user.getDedicatedBricks().size() == 0) {
				ans = user;
				break;
			}
		}
		return ans;
	}
}
