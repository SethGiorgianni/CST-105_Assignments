import java.util.ArrayList;

//Seth Giorgianni This Work is my own
public class NFLPlayerManager {

	//Properties for NFL Player Manager
	String teamName;
	ArrayList <NFLPlayer>NFLPlayerArray = new ArrayList<>(6);
	
	//Blank Constructor
	public NFLPlayerManager() {
		super();
	}
	
	//Constructor taking team name
	public NFLPlayerManager(String teamName) {
		super();
		this.teamName = teamName;
	}
	
	//Fills array with players
	public void createPlayers() {
		NFLPlayerArray.add(new NFLPlayer("Seth Giorgianni","GCU","Quarterback",25,50,20,40,0,0,9000000));
		NFLPlayerArray.add(new NFLPlayer("Jerry Crews","NAU","Quarterback",20,30,17,21,0,0,1250000));
		NFLPlayerArray.add(new NFLPlayer("Tommy Jones","ASU","Wide Reciever",19,70,34,51,0,0,750000));
		NFLPlayerArray.add(new NFLPlayer("Zac Johnson","UofA","Wide Reciever",21,20,5,11,0,0,800000));
		NFLPlayerArray.add(new NFLPlayer("Jack Smith","USC","Safety",23,31,24,26,0,0,7800000));
		NFLPlayerArray.add(new NFLPlayer("Mack Guy","GCU","Safety",22,90,63,71,0,0,12500000));
		NFLPlayerArray.add(new NFLPlayer("John Henry","NAU","Running Back",20,25,7,14,0,0,5600000));
		NFLPlayerArray.add(new NFLPlayer("George Washington","ASU","Running Back",23,34,20,21,0,0,3500000));
		NFLPlayerArray.add(new NFLPlayer("Abraham Lincoln","USC","Cornerback",24,41,13,20,0,0,2500000));
		NFLPlayerArray.add(new NFLPlayer("Freddy Thorpe","NAU","Cornerback",22,28,2,10,0,0,2000000));
		
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
