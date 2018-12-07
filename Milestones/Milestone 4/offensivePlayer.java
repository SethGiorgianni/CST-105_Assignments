//Seth Giorgianni This Work is my own.
public class offensivePlayer extends NFLPlayer {

	//Offensive Specific Stats
	private int yards;
	private int touchdowns;
	
	//Constructors
	public offensivePlayer() {
		super();
	}
	//Specific Constructor
	public offensivePlayer(String name,String college,String postion,int age,double gamesPlayed,
			double gamesWon,double gamesStarted,double gameStartAverage, double gameWinAverage,int salary, int yards, int touchdowns) {
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
		this.setYards(yards);
		this.setTouchdowns(touchdowns);
	}
	//To String Function Overrides NFLPlayer Class
	@Override
	public String toString() {
		return("NAME: " + this.getName() +"\nCOLLEGE: " + this.getCollege() +"\nPOSITION: " + this.getPosition() + "\nAGE: " +this.getAge()
		+ "\nGAMES PLAYED: " +this.getGamesPlayed() + "\nGAMES WON: " +this.getGamesWon() + "\nGAMES STARTED: " +this.getGamesStarted()
		+ "\nGAME START AVERAGE: " +this.getGameStartAverage() + "\nGAME WIN AVERAGE: " +this.getGameWinAverage() + "\nSALARY: $" +this.getSalary()
		+ "\nYARDS: " +this.getYards() + "\nTOUCHDOWNS: " + this.getTouchdowns());
	}
	
	//Getters and Setters
	public void setYards(int yards) {
		this.yards = yards;	
	}
	public int getYards() {
		return this.yards;	
	}
	
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}
	
	public int getTouchdowns() {
		return this.touchdowns;	
	}
}
