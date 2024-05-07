import java.util.Scanner;

public class Main {
    //initializing objects
    // strings which are sword, rope, hammer, armor
    // strings key, scroll. 

    public static void main(String[] args) {
         // where should these go

     String[][] midievalRoom = {
            {"Door",  "Empty",  "Trap",  "Empty"},
            {"Empty", "Empty",  "Sword", "Empty"},
            {"Trap",  "Empty",  "Empty", "Trap"},
            {"Empty", "Knight", "Empty", "Exit"},
         };
        Scanner gameScanner = new Scanner(System.in);  // I don't know why this is being mad
        System.out.println("Hello! Welcome to Escape the Museum! Where would you like to go?");
        System.out.println("HINT: You can use the verb 'go' to move and specify the direction: forward, right, left, backward \n You start in the corner of the map! Enjoy!");
// figure out how to loop this so that it keeps running!!
// switch
        while(true) {
                String inputString = gameScanner.nextLine().toLowerCase();
                if(inputString.contains("go")){
                    Map.playerGo(inputString, midievalRoom);
                }
                else if(inputString.contains("steal")){
                    if (inputString.contains("scroll")){
                        String object = "scroll";
                        User.steal(object, midievalRoom);
                    }
                    
                }
                else if(inputString.contains("take")){
                    if (inputString.contains("sword")){
                        String object = "sword";
                        User.take(object, midievalRoom);
                    }
                    //System.out.println("uh oh");
                }
                else if(inputString.contains("inventory")){
                    User.viewInventory();
                }
                else if(inputString.contains("drop")){
                    String object = inputString;
                    User.drop(object);
                }
                else if (inputString.contains("exit")) {
                    System.out.println("Exiting game. Goodbye!");
                    gameScanner.close();
                    break; // Exit the loop and end the game
                }
                else{
                    System.out.println("invalid input. PLease use a action along with direction or object ");
                }}

        
    }
}




