import java.util.Scanner;
public class GuessTheNumber
{ 
    // This is the height of Mt. Everest.
    static int everestHeight = 8848;
    
    public static void main(String[] args)
    {
        
        System.out.println("Do you know how tall Mt. Everest is?");
        System.out.println("See if you can guess the height in meters.");
        
        // This calls the static method guessTheHeight. Notice that the method is outside 
        // of the main method. 
        guessTheHeight();
        
    }
    
    public static void guessTheHeight() 
    {  
        // Your code goes here!
        // Allow the user to keep guessing until they guess the correct height
        
        // scanner
        Scanner scanner = new Scanner(System.in);
          
        //initialize variable for user's guess. 
        int guess = 0;
        //this creates a variable for the user's guess t compare to the Everest height variable. 
          
        //while loop, does not equal correct height. 
        while(guess != everestHeight)
        //this creates the loop that will run as long as the user's guess is not correct. 
        
        {
            // guess the height.
            System.out.println("Guess the height:");
            guess = scanner.nextInt();
            //this stores the user's guess to compare later. 
              
            //if correct height, break.
            if(guess == everestHeight)
            {
                break;
                //if the guess is correct, the loop will break. 
            }
              
            //print thats not it!
            System.out.println("That's not it!");
        }
          
        // print right statement. 
        System.out.println("Right! Mt. Everest is 8848 meters tall!");
        //prints after the user guesses correctly!
    }
}