import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*this is the map of the game, the player starts 
        at [0][0] and is supposed to find their way to "Exit" which is [5][5]
        there are objects, charcters, or traps in certain parts of the map which
        make the game
*/
     String[][] midievalRoom = {
            {"Door",  "Empty",  "Trap",  "Empty",   "Trap",     "Trap"},
            {"Empty", "Empty",  "Rope",  "Empty",   "Painting", "Empty"},
            {"Trap",  "Empty",  "Empty", "Trap",    "Empty",    "Trap"},
            {"Trap",  "Sword",  "Trap",  "Trap",    "Empty",    "Trap"},
            {"Trap",  "Empty",  "Empty", "Empty",   "Empty",    "Trap"},
            {"Empty", "Empty",  "Trap",  "Knight",  "Empty",    "Exit"},
         };
        Scanner gameScanner = new Scanner(System.in);  // I don't know why this is being mad
        System.out.println("Hello! Welcome to Escape the Museum! Where would you like to go?");
        System.out.println("HINT: You can use the verb 'go' to move and specify the direction: forward, right, left, backward \n You start in the corner of the map! Enjoy!");
        while(true) {
                String inputString = gameScanner.nextLine().toLowerCase();
                //if the input from the use has any of these commands, it will call certain methods
                if(inputString.contains("go")){
                    Map.playerGo(inputString, midievalRoom);
                }
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

                else if (midievalRoom[Map.trackCoordsX()][Map.trackCoordsY()] == "Rope") {
                    if (inputString.contains("take")){
                        if (inputString.contains("rope")) {
                            String object = "rope";
                            User.take(object, midievalRoom);
                        }
                    }
                }
            
                else if(inputString.contains("steal")){
                    if (inputString.contains("scroll")){
                        String object = "scroll";
                        User.steal(object, midievalRoom);
                    }
                    else if (inputString.contains("necklace")) {
                        String object = "necklace";
                        User.steal(object, midievalRoom);
                    }
                    
                }
                else if(inputString.contains("inventory")){
                    User.viewInventory();
                }

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

                else if (inputString.contains("exit")) {
                    System.out.println("Exiting game. Goodbye!");
                    gameScanner.close();
                    break; // Exit the loop and end the game
                }

                else if (midievalRoom[Map.trackCoordsX()][Map.trackCoordsY()] == "Knight") {
                    if (inputString.contains("fight")) {
                        Character.knightFight();
                    }
                    else if (inputString.contains("talk")) {
                        Character.knightTalk();
                    }
                }
                else if (midievalRoom[Map.trackCoordsX()][Map.trackCoordsY()] == "Painting") {
                    if (inputString.contains("freak out")) {
                        Character.paintingFight();
                    }
                    else if (inputString.contains("chat")) {
                        Character.paintingChat();
                    }
                } else {
                    System.out.println("invalid input. PLease use a action along with direction or object ");
                }
            }
        if (Character.knightFight() == false || Character.knightTalk() == false || Character.paintingChat() == false || Character.paintingFight() == false ) {
            gameScanner.close();
        }
    }


}




