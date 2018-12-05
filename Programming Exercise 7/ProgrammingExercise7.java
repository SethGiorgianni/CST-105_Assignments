//Seth Giorgianni This Work Is My Own


//This Program finds all palindromic primes from 2 to 100,000
public class ProgrammingExercise7 {
	
	//main method that runs the First 100,000 Numbers through isPrime and isPalindrome to check if they are palindromic primes.
	public static void main(String[] args) {
		
		System.out.println("Palindromic Primes For First 100,000 Numbers");
		for (int x = 2; x < 100000; x++) {
			if (isPrime(x) == true && isPalindrome(x)) {
				System.out.println(x);
			}	
		}
	}
	
	//Tests whether a number is a prime number
	public static boolean isPrime(int numToTest) {
		
		for (int x = 2; x < numToTest; x++) {
			if (numToTest%x == 0) {
				return false;
			}
		}
		return true;	
	}

	//Tests whether a number is a palindrome
	public static boolean isPalindrome(int numToTest) {
			String numString = Integer.toString(numToTest);
			for (int x = 0; x < numString.length(); x++) {
				if (numString.charAt(x) != numString.charAt(numString.length()-1-x)) {
					return false;
				}
			}
			return true;
	}	
}
