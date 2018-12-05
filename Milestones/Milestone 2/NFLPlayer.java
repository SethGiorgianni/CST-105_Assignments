//Seth Giorgianni This work is my own.

// Creates NFL Player class for use in draft application
public class NFLPlayer {
	
	//Player Attributes
	private String name;
	private String college;
	private String position;
	private int age;
	private double gamesPlayed;
	private double gamesWon;
	private double gamesStarted;
	private double gameStartAverage;
	private double gameWinAverage;
	private int salary;
	
	
	
	
	// Empty Constructor
	public NFLPlayer() {
		super();
	}
	
	//ARGS constructor
	public NFLPlayer(String name,String college,String postion,int age,double gamesPlayed,
	double gamesWon,double gamesStarted,double gameStartAverage, double gameWinAverage,int salary) {
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
	}

	public static void main(String[] args) {
		
	}
	
	
	//Returns String To Display Class
	public String toString() {
		return ("NAME: " + this.getName() +"\nCOLLEGE: " + this.getCollege() +"\nPOSITION: " + this.getPosition() + "\nAGE: " +this.getAge()
		+ "\nGAMES PLAYED: " +this.getGamesPlayed() + "\nGAMES WON: " +this.getGamesWon() + "\nGAMES STARTED: " +this.getGamesStarted()
		+ "\nGAME START AVERAGE: " +this.getGameStartAverage() + "\nGAME WIN AVERAGE: " +this.getGameWinAverage() + "\nSALARY: $" +this.getSalary());
		
	}
	
	//GETTER AND SETTER METHODS
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}

	public String getCollege() {
		return this.college;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return this.position;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	
	public void setGamesPlayed(double gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public double getGamesPlayed() {
		return this.gamesPlayed;
	}
	
	public void setGamesWon(double gamesWon) {
		this.gamesWon = gamesWon;
	}

	public double getGamesWon() {
		return this.gamesWon;
	}
	
	public void setGamesStarted(double gamesStarted) {
		this.gamesStarted = gamesStarted;
	}

	public double getGamesStarted() {
		return this.gamesStarted;
	}
	
	public void setGameStartAverage(double gameStartAverage) {
		this.gameStartAverage = gameStartAverage;
	}
	
	//CALCULATES GAME START AVERAGE FOR GETTER
	public double getGameStartAverage() {
		this.gameStartAverage = gamesStarted/this.gamesPlayed;
		return this.gameStartAverage;
	}
	
	public void setGameWinAverage(double gameWinAverage) {
		this.gameWinAverage = gameWinAverage;
	}

	//CALCULATES GAME WIN AVERAGE FOR GETTER
	public double getGameWinAverage() {
		this.gameWinAverage = gamesWon/this.gamesPlayed;
		return this.gameWinAverage;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return this.salary;
	}
}
