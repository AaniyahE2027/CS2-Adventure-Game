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
         System.out.println("You walk into Macy");
         command = getCommand("You spent hours in Macy and apporching ULTA...How much money do you want to spend? (type a number)");
         int money = Integer.parseInt(command);

         if (money <= 40){
            System.out.println("You didn't spend that much money, but all that walking up and down made you tired time to go home");
         }
         else {
            System.out.println("You spent too much money...can't afford food court");
         }
      }
      else if (command.equals("2")){
         System.out.println("You enter Pink");
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
       return command;
    } // END OF METHOD
 } // END OF CLASS

