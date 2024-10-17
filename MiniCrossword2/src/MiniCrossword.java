import java.util.ArrayList;
import java.util.Scanner;
public class MiniCrossword
{
	static String playerGuess;
	static String[][] boardOne = new String[5][5];
	static String[][] boardMatrix = new String[5][5];
	static boolean isPlaying = true;
	
	public static void main(String [] args)
			{
			greetPlayer();
			Data.fillcrosswordOne();  
			Data.fillcrosswordTwo();  
			prepareBoard();
			
			while (isPlaying) 
			{		
			displayQuestions();
			playerMove();
			displayQuestions();
			finishGame();
			}
			
			}//jyt
			

	
	public static void greetPlayer()
		{
		Scanner userInput = new Scanner (System.in);
		System.out.println("Hello! Lets play a crossword!! The board is 5 x 5, which means each word should be five letters. ");
		System.out.println( "To type your answer write the question number (ex. 1A or 1D) followed by your answer in all caps. ");
		System.out.println( "Lets start, press enter to begin. ");
		String playerGuess = userInput.nextLine();
		}
	
	public static void prepareBoard()
	  {
	     
	       for(int row = 0; row<boardOne.length;row++)
	        {
	          for(int col = 0; col< boardOne[0].length; col++)
	            {
	            boardMatrix[row][col] = "_";  
	            }
	        }
	  }
	
	public static void displayBoard()
	{	
		System.out.println("    1   2   3   4   5");
		System.out.println( "1 |___|___|___|___|___|");
		System.out.println( "2 |___|___|___|___|___|");		
		System.out.println( "3 |___|___|___|___|___|");		
		System.out.println( "4 |___|___|___|___|___|");		
		System.out.println( "5 |___|___|___|___|___|");
		System.out.println();
	}
	
	public static void displayQuestions()
		{ 
		System.out.println("Across Questions:                                                            Down Questions:");
	    System.out.println( Data.crosswordOne.get(0).getNumber() + ": " + Data.crosswordOne.get(0).getQuestion()+ "                  " + Data.crosswordTwo.get(0).getNumber() + ": " + Data.crosswordTwo.get(0).getQuestion());
	    System.out.println( Data.crosswordOne.get(1).getNumber() + ": " + Data.crosswordOne.get(1).getQuestion() + "       " + Data.crosswordTwo.get(1).getNumber() + ": " + Data.crosswordTwo.get(1).getQuestion());
	    System.out.println( Data.crosswordOne.get(2).getNumber() + ": " + Data.crosswordOne.get(2).getQuestion()+ "    " + Data.crosswordTwo.get(2).getNumber() + ": " + Data.crosswordTwo.get(2).getQuestion());
	    System.out.println( Data.crosswordOne.get(3).getNumber() + ": " + Data.crosswordOne.get(3).getQuestion()+ "             " + Data.crosswordTwo.get(3).getNumber() + ": " + Data.crosswordTwo.get(3).getQuestion());
	    System.out.println( Data.crosswordOne.get(4).getNumber() + ": " + Data.crosswordOne.get(4).getQuestion()+ "   " + Data.crosswordTwo.get(4).getNumber() + ": " + Data.crosswordTwo.get(4).getQuestion());
	    System.out.println();

		
		System.out.println("    1   2   3   4   5");
		System.out.println( "1 |_"+boardMatrix[0][0]+"_|_"+boardMatrix[0][1]+"_|_"+boardMatrix[0][2]+"_|_"+boardMatrix[0][3]+"_|_"+boardMatrix[0][4]+"_|");
		System.out.println( "2 |_"+boardMatrix[1][0]+"_|_"+boardMatrix[1][1]+"_|_"+boardMatrix[1][2]+"_|_"+boardMatrix[1][3]+"_|_"+boardMatrix[1][4]+"_|");
		System.out.println( "3 |_"+boardMatrix[2][0]+"_|_"+boardMatrix[2][1]+"_|_"+boardMatrix[2][2]+"_|_"+boardMatrix[2][3]+"_|_"+boardMatrix[2][4]+"_|");
		System.out.println( "4 |_"+boardMatrix[3][0]+"_|_"+boardMatrix[3][1]+"_|_"+boardMatrix[3][2]+"_|_"+boardMatrix[3][3]+"_|_"+boardMatrix[3][4]+"_|");
		System.out.println( "5 |_"+boardMatrix[4][0]+"_|_"+boardMatrix[4][1]+"_|_"+boardMatrix[4][2]+"_|_"+boardMatrix[4][3]+"_|_"+boardMatrix[4][4]+"_|");
		  System.out.println();
		}
		
	public static void playerMove()

		{
		
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter your guess (e.g., 1A BLANK): ");
			String playerInput = userInput.nextLine();
			
			String[] letters = playerInput.split(" ");
			if (letters.length != 2) 
			{
				System.out.println("Invalid input. Please follow the format '1A BLANK'.");
				return;
			}
			
			String questionNumber = letters[0];
			String answer = letters[1];
			
			boolean correctGuess = false;
			
		
			for (int i = 0; i < Data.crosswordOne.size(); i++) 
			{
		    Question q = Data.crosswordOne.get(i);
		    if (q.getNumber().equals(questionNumber) && q.getAnswer().equals(answer)) 
				{
				correctGuess = true;
				fillBoardAcross(q.getNumber(), q.getAnswer());
				}
			}
			
		
			for (int i = 0; i < Data.crosswordTwo.size(); i++) 
		    {
		    Question q = Data.crosswordTwo.get(i);
			if (q.getNumber().equals(questionNumber) && q.getAnswer().equals(answer)) 
				{
				correctGuess = true;
				fillBoardDown(q.getNumber(), q.getAnswer());
				}
			}
			
			if (!correctGuess)
			{
			System.out.println("Incorrect guess! Try again.");
			}
			
		}
	
    public static void fillBoardAcross(String number, String answer) 
     {
    	//charAT get each letter of a string
	int row = Integer.parseInt(number.substring(0, 1)) - 1; 
    for (int col = 0; col < 5; col++) 
    {
		boardMatrix[row][col] = String.valueOf(answer.charAt(col));
	}
	}
		
    public static void fillBoardDown(String number, String answer) 
	{
			int col = Integer.parseInt(number.substring(0, 1)) - 1; 
			for (int row = 0; row < 5; row++) 
			{
				boardMatrix[row][col] = String.valueOf(answer.charAt(row));
			}
	}
    
    public static void finishGame()
    {
    	if(	isPlaying = false)
    
    		{
    			System.out.println("Congrats! you have completed the crossword.");
    		}
    }
	
}
	
