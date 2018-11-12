import java.io.*;
import java.util.Scanner;
//Seth Giorgianni This work is my own.

public class programmingExercise5 {

	public static void main(String[] args)throws Exception {
		
		
		//creates reader and gets characters into program.
		File file = new File("F:\\Programs\\EclipseWorkplace\\ProgrammingExercise5\\src\\test"); 
		BufferedReader reader = new BufferedReader(new FileReader(file)); 
		String words = "";
		String tempWords = "";
		while ((tempWords = reader.readLine()) != null) {
			 words = words + tempWords;
		  }
		
		//Builds Array
		Character [][] charArray = new Character [20][45];
		//Final String
		String display = "";
		//Counter to help fill in array.
		int character = 0;
		
		//Fills our character Array 
		for (int y  = 0; y < 45; y++) {
			for (int x  = 0; x < charArray.length; x++) {
				if (character < words.length()){
					charArray[x] [y] = words.charAt(character);
					character++;
				}
				else {
					charArray[x] [y] = '@';
				}
			}	
		}
		 
		// Displays Array 
		String line = "";
		for (int y  = 0; y < 45; y++) {
			System.out.println(line);
			line = "";
			for (int x  = 0; x < charArray.length; x++) {
				line = line + String.valueOf(charArray[x] [y]);
					
			}	
		}
		
		//Builds our Display text from reading column first.
		for (int x  = 0; x < charArray.length; x++) {
			for (int y = 0; y < 45; y++) {
				if (charArray[x] [y] != '@'){
					display = display + String.valueOf(charArray[x] [y]);
				}
				else {
					break;
				}
			
			}
		
		}
		// Displays array
		System.out.println(display); 
	}
	
}
