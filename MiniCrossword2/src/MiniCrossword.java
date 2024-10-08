import java.util.ArrayList;
public class MiniCrossword
{
	static String playerGuess;
	static	String[][] boardMatrix = new String[5][5];
	
//	player says question number 1a ex and types the word,
//	and it fills out no matter wahter and displarys boarrd 
//	again until its all filled out, once they have fileld 
//	out out it will say i its corect or not. 
//	 try again, or try differetn questioh 	
//	** if i have time add a timer, and let the player redo crossword if the answer is wrong 

	public static void main(String[] args)
			{
			greetPlayer();
			displayBoard();
//p[oop

			public static void greetPlayer()
			{
			Scanner userInput = new Scanner (System.in);
			System.out.println("Hello! Lets play a crossword!! The board is 5 x 5, which means each word should be five letters. To type your answer write the question number (ex. 1A or 1D) followed by your answer in all caps. Lets start, press enter to begin.  ");
			String playerGuess = userInput.nextLine();
			playerGuess = userInput.nextLine();
				 }


		public static void displayBoard()
		{
			System.out.println(  "    1     2   3   4   5");
			System.out.println( "1 |_"+boardMatrix[0][0]+"_|_"+boardMatrix[0][1]+"_|_"+boardMatrix[0][2]+"_|_"+boardMatrix[0][3]+"_|_"+boardMatrix[0][4]+"_|");
			System.out.println( "2 |_"+boardMatrix[1][0]+"_|_"+boardMatrix[1][1]+"_|_"+boardMatrix[1][2]+"_|_"+boardMatrix[1][3]+"_|_"+boardMatrix[1][4]+"_|");
			System.out.println( "3 |_"+boardMatrix[2][0]+"_|_"+boardMatrix[2][1]+"_|_"+boardMatrix[2][2]+"_|_"+boardMatrix[2][3]+"_|_"+boardMatrix[2][4]+"_|");
			System.out.println( "4 |_"+boardMatrix[3][0]+"_|_"+boardMatrix[3][1]+"_|_"+boardMatrix[3][2]+"_|_"+boardMatrix[3][3]+"_|_"+boardMatrix[3][4]+"_|");
			System.out.println( "5 |_"+boardMatrix[4][0]+"_|_"+boardMatrix[4][1]+"_|_"+boardMatrix[4][2]+"_|_"+boardMatrix[4][3]+"_|_"+boardMatrix[4][4]+"_|");
		
		}

			else if(!playerGuess.equals(Data.crosswordOne.get(0).getAnswer()))
			{
						boardMatrix[0][0] = playerGuess.indexOf(0);
						boardMatrix[0][1] = playerGuess.indexOf(1);
						boardMatrix[0][2] = playerGuess.indexOf(2);
						boardMatrix[0][3] = playerGuess.indexOf(3);
						boardMatrix[0][4] = playerGuess.indexOf(4);
			//			boardMatrix[0][0] = playerGuess.subString(0);
			//			boardMatrix[0][1] = playerGuess.indexOf(1);
			//			boardMatrix[0][2] = playerGuess.indexOf(2);
			//			boardMatrix[0][3] = playerGuess.indexOf(3);
			//			boardMatrix[0][4] = playerGuess.indexOf(4);
			}

}  

			public static void checkAnswer()
			{
			
			}

}


