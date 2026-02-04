// Alejandro Garcia
/*
 * CSC-321-40
 * Lab #4
 */

import java.util.Scanner;

public class agarcia4
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the following number for a sentence or joke: ");
		System.out.println("1) User's favorite Radio FM");
		System.out.println("2) User's favorite Movie");
                System.out.println("3) User's favorite Color");
                System.out.println("4) Joke");	
		int userInput = kb.nextInt();

		switch (userInput) 
        	{
      			case 1:
				System.out.println("My favorite radio station is 92.3.");
           	 		break;
        		case 2:
                    		System.out.println("My favorite movie is Spider-man: Into the Spider Verse.");
       			     	break;
        		case 3:
                                System.out.println("My favorite color is red.");
			     	break;
 			case 4:
                                System.out.println("How does the ocean say goodbye? Sea you later!");
                             	break;			     
        		default:
        	    		System.out.println("Error: Please only input 1,2,3, or 4.");
        	}

	}
}
