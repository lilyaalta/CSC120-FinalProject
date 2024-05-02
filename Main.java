import java.util.Scanner;

public class Main {
    //initializing objects
    // strings which are sword, rope, hammer, armor
    // strings key, scroll. 
    public static void main(String[] args) {
         // where should these go

        String[][] midievalRoom = {
            {"Door", "Blocked", "Blocked", "Blocked"},
            {"Empty", "Empty", "Object", "Blocked"},
            {"Trap", "Empty", "Empty", "Blocked"},
            {"Blocked", "Knight", "Empty", "Door"}
         };
     //  String[][] jewelryRoom = {
    //     {"Door", "Blocked", "Blocked", "Blocked"},
    //     {"Empty", "Hammer", "Empty", "Empty"},
    //     {"Trap", "Empty", "Empty", "Rope"},
    //     {"Blocked", "Blocked", "Blocked", "Door"}
    // };
    //  String[][] paintingRoom = {
    //     {"Door",   "Character", "Blocked", "Trap"},
    //     {"Empty",  "Trap",      "Rope",     "Trap"},
    //     {"Empty",  "Empty",     "Empty",    "Sword"},
    //     {"Hammer", "Empty",     "Trap",     "Door"}
    // };
        Scanner gameScanner = new Scanner(System.in);  // I don't know why this is being mad
        System.out.println("Hello! Welcome to Escape the Museum! Where would you like to go?");
        System.out.println("HINT: You can use the verb 'go' to move and specify the direction: forward, right, left, backward");
// figure out how to loop this so that it keeps running!!
        while(true) {
            String inputString = gameScanner.nextLine().toLowerCase();
            if(inputString.contains("go")){
                String direction = inputString;
                Map.getSpot(midievalRoom);
                Map.playerGo(direction, midievalRoom);
            }
            if(inputString.contains("steal")){
                String object = inputString;
                User.steal(object, midievalRoom);
                
            }
            if(inputString.contains("take")){
                String object = inputString;
                User.take(object, midievalRoom);
            }
            if(inputString.contains("view inventory")){
                User.viewInventory();
            }
            if(inputString.contains("drop")){
                String object = inputString;
                User.drop(object);
            }
            else if (inputString.contains("exit")) {
                System.out.println("Exiting game. Goodbye!");
                break; // Exit the loop and end the game
            }
            else{
                System.out.println("invalid input. PLease use a action along with direction or object ");
            }
        }
        gameScanner.close();
  }
}
