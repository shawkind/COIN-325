// *****************************************************************************************
// Shawn Kindrick                                                           02 Feb 2015
// LAB 4
//
// 		This program prompts the user to enter a string (their name) and then counts and   
// 			outputs the number of each vowel (a, e, i, o , and u), and the number of 
//			non-vowels (consonants) to the terminal.
//
//******************************************************************************************


import java.util.Scanner;

public class AnalyseString 
{
	public static void main(String[] args)
	{
		  
	// Member variables
	String userInput, lowUserInput;
	int aCount = 0;
	int eCount = 0;
	int iCount = 0;
	int oCount = 0;
	int uCount = 0;
	int conCount = 0;
	int spaceCount = 0;
		
	// Creates a new user input 
	Scanner scanner = new Scanner(System.in); // Creates new user input
			
		
	System.out.println("Please enter a string, perhaps your name?"); //Prompts for user input 
	userInput = scanner.nextLine(); // Stores users entry
	System.out.println();
	System.out.println("You entered:" + userInput);// Shows users input back on terminal
	System.out.println();
	lowUserInput = userInput.toLowerCase();	
			
		for (int i = 0; i < lowUserInput.length(); ++i) // Loop for duration of string
		{	
			switch (lowUserInput.charAt(i)) // Switch to check each character
			{
				//Checks for vowels first and adds to counter respectively
				case 'a':
					aCount++ ;
					break ;
				case 'e':
					eCount++ ; 
					break ;
				case 'i':
					iCount++ ;
					break ;
				case 'o':
					oCount++ ;
					break ;
				case 'u':
					uCount++ ;
					break ;
				case ' ':
					spaceCount++ ;
					break ;
				default:
					conCount++ ;  // If its not a vowel, or a space, it has to be a consonant
			}		
		}	
			
			
		System.out.println("Your entry of " + userInput + " contains the following:"); 
		System.out.println();
		System.out.println("A's = " +  aCount + "."); 
		System.out.println();
		System.out.println("E's = " +  eCount + "."); 
		System.out.println();
		System.out.println("I's = " +  iCount + "." ); 
		System.out.println();
		System.out.println("O's = " +  oCount + "." ); 
		System.out.println();
		System.out.println("U's = " +  uCount + "." ); 
		System.out.println();
		System.out.println("Consonant's = " +  conCount + "." ); 		
	}
}