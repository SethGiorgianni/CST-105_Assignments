import java.io.*;
import java.util.Scanner;


//Seth Giorgianni This Is My Own Work
public class GiorgianniExercise4PigLatin {
	
	//Reads A line in a text file and converts to Pig Latin.
	public static void main(String[] args)throws Exception {
		
		//Sets up our files and variables
		File file = new File("C:\\Users\\Seth\\Desktop\\PigLatinWords.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String words = br.readLine();
		
		// we need 2 arrays one for the originalwords and one for the translated words
		String[] brokenWords = words.split(" ");
		int howManyWords = brokenWords.length;
		String[] translatedWords = new String[howManyWords];
		
		
		//converts each word of file to new word
		for (int i=0; i<howManyWords; i++) {
			String tempWord = pigLatinConvert(brokenWords[i]);
			tempWord = tempWord.toUpperCase();
			translatedWords[i] = tempWord;
		}
		
		// displays the sentence before and after
		for (int i=0; i<howManyWords; i++) {
			System.out.println(brokenWords[i]+ "	" + translatedWords[i]);
		}
	}
	
		
	// Method that is used to actually convert each word
	private static String pigLatinConvert(String word) {
	    int split = vowelFind(word);
	    if (split == 0) {
	    	return word.substring(split)+word.substring(0, split)+"way";
	    }
	    else {
	    return word.substring(split)+word.substring(0, split)+"ay";
	    }
	  }
	
	// Method to help find the first vowel
	private static int vowelFind(String word) {
		    for (int i=0; i<word.length(); i++) 
		      if (word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || 
		      	  word.charAt(i)=='o' || word.charAt(i)=='u' || word.charAt(i)=='A' || 
		      	  word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || 
		      	  word.charAt(i)=='U') 
		          return i;
		      return 0;
		    

		
		
	}

}