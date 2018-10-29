import java.util.Scanner;

//Seth Giorgianni This is my own work	
public class CST105Exercise2Part1 {

	public static void main(String[] args) {
		// Asks user for 5 digit integer and adds the sum.
		
		//Asks User for the 5 digit integer
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a 5 digit positive integer: ");
		int numToSum = reader.nextInt();
		
		//Calculates First Digit
		int firstDigitTemp = numToSum%10000;
		int firstDigit = (numToSum-firstDigitTemp)/10000;
		
		//Calculates Second Digit
		int secondDigitTemp= ((numToSum-(firstDigit*10000))%1000);
		int secondDigit =  (numToSum-(firstDigit*10000)-secondDigitTemp)/1000;
		
		//Calculates Third Digit
		int thirdDigitTemp= ((numToSum-(firstDigit*10000)-(secondDigit*1000))%100);
		int thirdDigit =  (numToSum-(firstDigit*10000)-(secondDigit*1000))/100;
		
		//Calculates Fourth Digit
		int fourthDigitTemp= ((numToSum-(firstDigit*10000)-(secondDigit*1000)-(thirdDigit*100))%10);
		int fourthDigit =  (numToSum-(firstDigit*10000)-(secondDigit*1000)-(thirdDigit*100))/10;
		
		//Calculates Fifth Digit
		int fifthDigitTemp= ((numToSum-(firstDigit*10000)-(secondDigit*1000)-(thirdDigit*100)-(fourthDigit*10))%1);
		int fifthDigit =  (numToSum-(firstDigit*10000)-(secondDigit*1000)-(thirdDigit*100)-(fourthDigit*10))/1;
		

		//Calculates The Sum
		int sumOfInput = firstDigit+secondDigit+thirdDigit+fourthDigit+fifthDigit;
		
		//Displays Result to User
		System.out.printf("The sum of the digits is %d + %d + %d + %d + %d = %d", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit, sumOfInput);
		
	}

}
