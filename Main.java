 import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices
       
       // STEP #1: Describe the current scenario
       System.out.println("You are at the Mall! Your goal is to buy food at the food court...");
       // STEP #2: Get user command
       command = getCommand("There is multiple entrance for the mall. Would you like to go through door (1), (2), or (3)");
      // STEP #3: Select a path based on the user's input
      if (command.equals("1")) {
         // New branch...
         System.out.println("You reach the Carousel");
      }  
      else if (command.equals("n")){
         System.out.println("You see a wedding at Tavern on the Greene");
      }
      else{
         System.out.println("GAME OVER!");
      }



    } // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       scan.close();
       return command;
    } // END OF METHOD
 } // END OF CLASS

