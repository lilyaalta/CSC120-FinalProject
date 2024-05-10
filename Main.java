import java.util.Scanner;

/**
 * Holds just one main method that holds the map layout, game scanner, else/if statements that evaluate user inputs,
 * location, and have the ability to close the scanner when the game is done.
 *  
 */
public class Main {
/**
 * The main method which houses the map and scanner interactions
 * @param args
 */
    public static void main(String[] args) {
        /*this is the map of the game, the player starts 
        at [0][0] and is supposed to find their way to "Exit" which is [5][5]
        there are objects, charcters, or traps in certain parts of the map which
        make the game
        */

// Map of the game, 6x6 room
     String[][] midievalRoom = {
            {"Door",  "Empty",  "Trap",  "Empty",   "Trap",     "Trap"},
            {"Empty", "Empty",  "Rope",  "Empty",   "Painting", "Key" },
            {"Trap",  "Empty",  "Empty", "Trap",    "Empty",    "Trap"},
            {"Trap",  "Sword",  "Trap",  "Trap",    "Empty",    "Trap"},
            {"Trap",  "Empty",  "Empty", "Empty",   "Empty",    "Trap"},
            {"Empty", "Empty",  "Trap",  "Knight",  "Empty",    "Exit"},
         };
        // scanner for whole game
        Scanner gameScanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to Escape the Museum! Where would you like to go?");
        System.out.println("HINT: You can use the verb 'go' to move and specify the direction: forward, right, left, backward \n If you need more help, enter 'help me' for some assistance. \n You start in the corner of the map! Enjoy!");
        while(true) {
            // while the scanner is open
                String inputString = gameScanner.nextLine().toLowerCase();
                //if the input from the use has any of these commands, it will call certain methods
                if(inputString.contains("go")){
                    Map.playerGo(inputString, midievalRoom);
                }
                // if the user is at the space "Sword" and they want to take it, they can
                else if (midievalRoom[Map.trackCoordsX()][Map.trackCoordsY()] == "Sword") {
                    if (inputString.contains("take")){
                        if (inputString.contains("sword")){
                            String object = "sword";
                            User.take(object, midievalRoom);
                        }
                    } 
                    else if (inputString.contains("inventory")) {
                        User.viewInventory();
                    }
                }
                // if the user is at the space "Rope" and they want to take it, they can
                else if (midievalRoom[Map.trackCoordsX()][Map.trackCoordsY()] == "Rope") {
                    if (inputString.contains("take")){
                        if (inputString.contains("rope")) {
                            String object = "rope";
                            User.take(object, midievalRoom);
                        }
                    }
                }
                // if the user wants to steak the scroll, key, or necklace
                else if(inputString.contains("steal")){
                    if (inputString.contains("scroll")){
                        String object = "scroll";
                        User.steal(object, midievalRoom);
                    }
                    else if (inputString.contains("key")){
                        String object = "key";
                        User.steal(object, midievalRoom);
                    }
                    else if (inputString.contains("necklace")) {
                        String object = "necklace";
                        User.steal(object, midievalRoom);
                    }
                    
                }
                // if they want to view inventory
                else if(inputString.contains("inventory")){
                    User.viewInventory();
                }
                // if they want to drop any object
                else if(inputString.contains("drop")){
                    if (inputString.contains("necklace")){
                        String object = "necklace";
                        User.drop(object);
                    }
                    if (inputString.contains("scroll")){
                        String object = "scroll";
                        User.drop(object);
                    }
                    if (inputString.contains("sword")){
                        String object = "sword";
                        User.drop(object);
                    }
                    if (inputString.contains("rope")){
                        String object = "rope";
                        User.drop(object);
                    }
                }
                // for any rage-quitters
                else if (inputString.contains("exit")) {
                    System.out.println("Exiting game. Goodbye!");
                    gameScanner.close();
                    break; // Exit the loop and end the game
                }
                // if they land on the knight spot, and if they choose fight or talk
                else if (midievalRoom[Map.trackCoordsX()][Map.trackCoordsY()] == "Knight") {
                    if (inputString.contains("fight")) {
                        Character.knightFight();
                    }
                    else if (inputString.contains("talk")) {
                        Character.knightTalk();
                    }
                }
                // if they land on the knight spot, and if they choose freak out or chat
                else if (midievalRoom[Map.trackCoordsX()][Map.trackCoordsY()] == "Painting") {
                    if (inputString.contains("freak out")) {
                        Character.paintingFight();
                    }
                    else if (inputString.contains("chat")) {
                        Character.paintingChat();
                    }        
                }
                // if user needs a little help
                else if (inputString.contains("help")){
                    User.helpUser();
                }
                // anything else...
                else {
                    System.out.println("invalid input. PLease use a action along with direction or object ");
                }
            }
            // if the chanceOfSurvival() returns false and the user dies/gets arrested/etc, game over
        if (Character.knightFight() == false || Character.knightTalk() == false || Character.paintingChat() == false || Character.paintingFight() == false ) {
            gameScanner.close();
        }
    }


}




