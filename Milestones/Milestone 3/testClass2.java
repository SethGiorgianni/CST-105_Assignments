//Seth Giorgianni This Work Is My Own
public class testClass2 {
	//Tests creating some teams of player arrays and tests create players and toString Function
	public static void main(String[] args) {
		NFLPlayerManager team1 = new NFLPlayerManager();
		NFLPlayerManager team2 = new NFLPlayerManager("Cardinals");
		team2.createPlayers();
		System.out.println(team2.toString());

	}

}
