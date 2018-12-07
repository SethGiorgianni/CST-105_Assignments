//Seth Giorgianni This Work is my own.
public class defensivePlayer extends NFLPlayer {

	private int interceptions;
	private int tackles;
	
	//Constructors
	public defensivePlayer() {
		super();
	}

	//Specific Constructors.
	public defensivePlayer(String name,String college,String postion,int age,double gamesPlayed,
			double gamesWon,double gamesStarted,double gameStartAverage, double gameWinAverage,int salary, int interceptions, int tackles) {
		super();
		this.setName(name);
		this.setCollege(college);
		this.setPosition(postion);
		this.setAge(age);
		this.setGamesPlayed(gamesPlayed);
		this.setGamesStarted(gamesStarted);
		this.setGamesWon(gamesWon);
		this.setGameStartAverage(gameStartAverage);
		this.setGameWinAverage(gameWinAverage);
		this.setSalary(salary);
		this.setInterceptions(interceptions);
		this.setTackles(tackles);
	}
	//To String Function Overrides NFLPlayer Class
	@Override
	public String toString() {
		return("NAME: " + this.getName() +"\nCOLLEGE: " + this.getCollege() +"\nPOSITION: " + this.getPosition() + "\nAGE: " +this.getAge()
		+ "\nGAMES PLAYED: " +this.getGamesPlayed() + "\nGAMES WON: " +this.getGamesWon() + "\nGAMES STARTED: " +this.getGamesStarted()
		+ "\nGAME START AVERAGE: " +this.getGameStartAverage() + "\nGAME WIN AVERAGE: " +this.getGameWinAverage() + "\nSALARY: $" +this.getSalary()
		+ "\nINTERCEPTIONS: " +this.getInterceptions() + "\nTACKLES: " + this.getTackles());
	}
	
	//Getters and Setters
	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;	
	}
	public int getInterceptions() {
		return this.interceptions;	
	}
	
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}
	
	public int getTackles() {
		return this.tackles;	
	}
}
