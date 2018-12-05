import java.util.ArrayList;

//Seth Giorgianni This Work is my own
public class NFLPlayerManager {

	//Properties for NFL Player Manager
	String teamName;
	ArrayList <NFLPlayer>NFLPlayerArray = new ArrayList<>(6);
	
	//Blank Constructor
	public NFLPlayerManager() {
		super();
		System.out.println("No Args Constructor Called");
	}
	
	//Constructor taking team name
	public NFLPlayerManager(String teamName) {
		super();
		this.teamName = teamName;
	}
	
	//Fills array with players
	public void createPlayers() {
		for (int x = 0; x < 6; x++) {
			NFLPlayerArray.add(new NFLPlayer());
		}
	}
	
	//Prints Contents of Player Array
	public String toString() {
		String displayString = teamName;
		for (int x = 0; x < NFLPlayerArray.size(); x++ ) {
			NFLPlayer player = NFLPlayerArray.get(x);
			displayString = displayString + "\n\n" + player.toString();
		}
		return displayString;
	}

}
