import java.util.ArrayList;
public class Data
  {
  static ArrayList<Question> crosswordOne = new ArrayList<Question>();
   
  static ArrayList<Question> crosswordTwo = new ArrayList<Question>(); 

  public static void fillcrosswordOne ()
    {
        crosswordOne.add(new Question("1A ","This country's capital is Santiago ", "Chile" ));
        crosswordOne.add(new Question("2A ","What babies do before they know how to walk ", "Crawl" )); 
        crosswordOne.add(new Question("3A ","What is the name of the smallest country in the world? ", "VATICAN CITY" )); 
        crosswordOne.add(new Question("4A ","What country are the Great Pyramids of Giza located in?  ", "EGYPT"  )); 
        crosswordOne.add(new Question("5A ", "What is the name of the tallest mountain in the world? ", "MOUNT EVEREST"  )); 
       
        crosswordOne.add(new Question("1A ","What do you receive on a test to show how well you did? ", "GRADE" ));
        crosswordOne.add(new Question("2A "," How do you describe the feeling when someone cares deeply for you?", "LOVED" )); 
        crosswordOne.add(new Question("3A ","What is the word for being surrounded by a group of people or things? ", "AMONG" )); 
        crosswordOne.add(new Question("4A ","WWhat do you do when you lift something to a higher position  ", "RAISE"  )); 
        crosswordOne.add(new Question("5A ", "What is the word for when something has come to a close or conclusion? ", "ENDED"  ));  
    }
 
 


  public static void fillcrosswordTwo ()
    {
        crosswordTwo.add(new Question( "1D ","This country's capital is Santiago ", "Chile" ));
        crosswordTwo.add(new Question("2D ","What babies do before they know how to walk ", "Crawl" )); 
        crosswordTwo.add(new Question("3D ","What is the name of the smallest country in the world? ", "VATICAN CITY" )); 
        crosswordTwo.add(new Question("4D ","What country are the Great Pyramids of Giza located in?  ", "EGYPT"  )); 
        crosswordTwo.add(new Question("5D ", "What is the name of the tallest mountain in the world? ", "MOUNT EVEREST"  )); 
       
        crosswordTwo.add(new Question( "1D ","What do you call a bright, harsh light that’s difficult to look at?", "GLARE" ));
        crosswordTwo.add(new Question("2D ","What term refers to someone from the ancient empire that built roads and aqueducts? ", "ROMAN" )); 
        crosswordTwo.add(new Question("3D ","What do you do when you deliberately stay away from something or someone? ", "AVOID" )); 
        crosswordTwo.add(new Question("4D ","What do you call something that is packed tightly or has little empty space inside? ", "DENSE"  )); 
        crosswordTwo.add(new Question("5D ", "What word describes an object that has a sharp boundary or outline? ", "EDGED"  )); 
    }
  }
