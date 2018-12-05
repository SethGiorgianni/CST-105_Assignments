//Seth Giorgianni This Work Is My Own
public class testClass1 {

	public static void main(String[] args) {
		//Tests Blank Constructor and tests some of the set methods.
		NFLPlayer player1 = new NFLPlayer();
		player1.setName("George Washington");
		player1.setSalary(1000000);
		player1.setAge(30);
		player1.setCollege("ASU");
		player1.setGamesPlayed(100);
		player1.setGamesStarted(50);
		player1.setGamesWon(40);
		player1.setPosition("QB");
		System.out.println(player1.toString());
		
		//Testing Full constructor and changing some values
		NFLPlayer player2 = new NFLPlayer("Seth Giorgianni","GCU","QB",25,50,
				20,40,0,0,1250000);
		player2.setAge(26);
		player2.getCollege();
		player2.setPosition("WR");
		System.out.println(player2.toString());
	}

}
