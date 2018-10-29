import java.util.Scanner;

//Seth Giorgianni This Work Is My Own
public class CST105Exercise2Part2 {

	public static void main(String[] args) {
		//Asks User To Enter Temp in Farenheit Then Celsius Then Convert Both.
		
		//Asks For Temp in Fahrenheit
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Fahrenheit temperature: ");
		double fahrenheitTemp = reader.nextInt();
		
		//Converts Fahrenheit To Celsius and Prints To User
		double fahrenheitConverted = (double) ((fahrenheitTemp - 32.0)*(5.0/9.0));
		System.out.printf("%.0fF is equivalent to %fC", fahrenheitTemp,fahrenheitConverted);
		
		//Asks For Temp in Celsius
		System.out.println("\nEnter a Celsius temperature: ");
		double celsiusTemp = reader.nextInt();

		//Converts Celsius To Fahrenheit and Prints To User
		double celsiusConverted = (double) ((celsiusTemp * (9.0/5.0)) + 32.0);
		System.out.printf("%.0fC is equivalent to %fF", celsiusTemp, celsiusConverted);
	}

}
